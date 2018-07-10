package com.example.campnou.myapplication12;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/7/10.
 */

public class StudentScoreActivity extends Activity{
    private ListView total_score;
//    private List<Student> list = new ArrayList<Student>();
//    private StudentDBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_student_score);
//        dbHelper = myDatabaseHelper.getInstance(this);
//        initInfo();//初始化数据
//        StudentScoreAdapter adapter = new StudentScoreAdapter(student_total_score.this, R.layout.student_score_item, list);
//        total_score = (ListView) findViewById(R.id.total_list_view);
//        total_score.setAdapter(adapter);

    }

    //成绩排序
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = new MenuInflater(this); //getMenuInflater();
        inflater.inflate(R.menu.score_menu, menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.id_score_sort:

                break;

        }
        return super.onOptionsItemSelected(item);
    }

    //初始化数据
    private void initInfo() {
//        SQLiteDatabase db = dbHelper.getWritableDatabase();
//        Cursor cursor = db.rawQuery("select * from student order by mathScore+chineseScore+englishScore desc", null);
//        int i = 0;
//        while (cursor.moveToNext()) {
//            i++;
//            String id = cursor.getString(cursor.getColumnIndex("id"));
//            String name = cursor.getString(cursor.getColumnIndex("name"));
//            String password = cursor.getString(cursor.getColumnIndex("password"));
//            String sex = cursor.getString(cursor.getColumnIndex("sex"));
//            String number = cursor.getString(cursor.getColumnIndex("number"));
//            int mathScore = cursor.getInt(cursor.getColumnIndex("mathScore"));
//            int chineseScore = cursor.getInt(cursor.getColumnIndex("chineseScore"));
//            int englishScore = cursor.getInt(cursor.getColumnIndex("englishScore"));
//            db.execSQL("update  student set ranking=? where id=?",new String[]{String.valueOf(i),id});//将排名插入数据库
//            list.add(new Student(chineseScore, englishScore, id, mathScore, name, number, password, sex, i));
        return;
        }
//        cursor.close();


    }

