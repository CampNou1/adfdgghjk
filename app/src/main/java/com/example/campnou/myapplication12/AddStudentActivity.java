package com.example.campnou.myapplication12;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/7/9.
 */

public class AddStudentActivity extends Activity implements View.OnClickListener{
    private static final String TAG = "AddStudentActivity";
    private final static int DATE_DIALOG = 1;
    private static final int DATE_PICKER_ID = 1;
    private EditText idText;
    private EditText nameText;
    private EditText ageText;
    private EditText phoneText;
    private RadioGroup group;
    private RadioButton button1;
    private RadioButton button2;
    private EditText birthdayText;
    private EditText majorText;
    private Button restoreButton;
    private String sex;
    private Button resetButton;
    private int student_id;
//    private StudentDao dao;
    private boolean isAdd = true;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_addstudent);
        idText = (EditText) findViewById(R.id.et_stu_id);
        nameText = (EditText) findViewById(R.id.et_name);
        ageText = (EditText) findViewById(R.id.et_age);
        button1 = (RadioButton) findViewById(R.id.rb_sex_female);
        button2 = (RadioButton) findViewById(R.id.rb_sex_male);
        phoneText = (EditText) findViewById(R.id.et_phone);
        birthdayText = (EditText) findViewById(R.id.et_birthday);
        group = (RadioGroup) findViewById(R.id.rg_sex);
        majorText = (EditText) findViewById(R.id.et_major);
        restoreButton = (Button) findViewById(R.id.btn_save);
        resetButton = (Button) findViewById(R.id.btn_clear);
//        dao = new StudentDao(new StudentDBHelper(this)); // 设置监听 78
        restoreButton.setOnClickListener(this);
        resetButton.setOnClickListener(this);
        birthdayText.setOnClickListener(this);
        checkIsAddStudent();
    }
    // 检查此时Activity是否用于添加学员信息
    private void checkIsAddStudent() {
        Intent intent = getIntent();
        Serializable serial = intent.getSerializableExtra(TableContanst.STUDENT_TABLE);
        if (serial == null) {
            isAdd = true;
            birthdayText.setText(getCurrentDate());
        } else {
            isAdd = false;
//            Student s = (Student) serial;
//            showEditUI(s);
        }
    }
    //显示学员信息更新的UI104
//    private void showEditUI(Student student) {
//        // 先将Student携带的数据还原到student的每一个属性中去
//        int id = student.getId();
//        String name = student.getName();
//        int age = student.getAge();
//        String phone = student.getPhonenumber();
//        String birthday= student.getBirthday();
//        String major = student.getMajor();
//        String sex = student.getSex();
//        if (sex.toString().equals("男")) {
//            button2.setChecked(true);
//        } else if (sex.toString().equals("女")) {
//            button1.setChecked(true);
//        }
//
//        // 还原数据
//        idText.setText(id + "");
//        nameText.setText(name + "");
//        ageText.setText(age + "");
//        phoneText.setText(phone + "");
//        majorText.setText(major + "");
//        birthdayText.setText(birthday + "");
//        setTitle("学员信息更新");
//        restoreButton.setText("更新");
//    }
    public void onClick(View v) {
        // 收集数据
//        if (v == restoreButton) {
//            if (!checkUIInput()) {// 界面输入验证
//                return;
//            }
//            Student student = getStudentFromUI();
//            if (isAdd) {
//                int id = dao.addStudent(student);
//                dao.closeDB();
//                if (id > 0) {
//                    Toast.makeText(this, "保存成功" + id,Toast.LENGTH_SHORT).show();
//                    finish();
//                } else {
//                    Toast.makeText(this, "保存失败，请重新输入！", Toast.LENGTH_SHORT).show();
//                }
//            } else if (!isAdd) {
//                int id = dao.addStudent(student);
//                dao.closeDB();
//                if (id > 0) {
//                    Toast.makeText(this, "更新成功",Toast.LENGTH_SHORT).show();
//                    finish();
//                } else {
//                    Toast.makeText(this, "更新失败，请重新输入！",Toast.LENGTH_SHORT).show();
//                }
//            }
//        } else if (v == resetButton) {
//            clearUIData();
//        } else if (v == birthdayText) {
//            showDialog(DATE_PICKER_ID);
//        }
    }
    //       清空界面的数据176
    private void clearUIData() {
        idText.setText("");
        nameText.setText("");
        ageText.setText("");
        phoneText.setText("");
        birthdayText.setText("");
        majorText.setText("");
        group.clearCheck();
    }
    //      收集界面输入的数据，并将封装成Student对象
//    private Student getStudentFromUI() {
//        int id = Integer.parseInt(idText.getText().toString());
//        String name = nameText.getText().toString();
//        int age = Integer.parseInt(ageText.getText().toString());
//        String sex = ((RadioButton) findViewById(group
//                .getCheckedRadioButtonId())).getText().toString();
//        String major = majorText.getText().toString();
//        String birthday = birthdayText.getText().toString();
//        String phoneNumber = phoneText.getText().toString();
//        String modifyDateTime = getCurrentDateTime();
//        Student s=new Student(id, name, age, sex, major, phoneNumber, birthday, modifyDateTime);
//        if (!isAdd) {
//            s.setId(Integer.parseInt(idText.getText().toString()));
//            dao.deleteStudentById(student_id);
//        }
//        return s;
//    }
    //      * 得到当前的日期时间
    private String getCurrentDateTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return format.format(new Date());
    }
    //      * 得到当前的日期
    private String getCurrentDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(new Date());
    }
    //验证用户是否按要求输入了数据
    private boolean checkUIInput() { // name, age, sex
        String name = nameText.getText().toString();
        String age = ageText.getText().toString();
        int id = group.getCheckedRadioButtonId();
        String message = null;
        View invadView = null;
        if (name.trim().length() == 0) {
            message = "请输入姓名！";
            invadView = nameText;
        } else if (age.trim().length() == 0) {
            message = "请输入年龄！";
            invadView = ageText;
        } else if (id == -1) {
            message = "请选择性别！";
        }
        if (message != null) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            if (invadView != null)
                invadView.requestFocus();
            return false;
        }         return true;     }
    //时间的监听与事件
    private DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener()
    {
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
             birthdayText.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
        }
    };
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_PICKER_ID:
                return new DatePickerDialog(this, onDateSetListener, 2011, 8, 14);
        }
        return null;
    }
}
