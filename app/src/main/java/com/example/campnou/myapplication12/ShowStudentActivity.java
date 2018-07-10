package com.example.campnou.myapplication12;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/**
 * Created by Administrator on 2018/7/8.
 */

public class ShowStudentActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showstudent);
        Intent intent = getIntent();
//        Student student = (Student) intent.getSerializableExtra(TableContanst.STUDENT_TABLE);
//        ((TextView)findViewById(R.id.tv_info_id)).setText(student.getId()+"");
//        ((TextView)findViewById(R.id.tv_info_name)).setText(student.getName());
//        ((TextView)findViewById(R.id.tv_info_age)).setText(student.getAge()+"");
//        ((TextView)findViewById(R.id.tv_info_sex)).setText(student.getSex());
//        ((TextView)findViewById(R.id.tv_info_major)).setText(student.getMajor());
//        ((TextView)findViewById(R.id.tv_info_birthday)).setText(student.getBirthday());
//        ((TextView)findViewById(R.id.tv_info_phone)).setText(student.getPhonenumber());
    }
    public void goBack(View view) {
        finish();
    }
}
