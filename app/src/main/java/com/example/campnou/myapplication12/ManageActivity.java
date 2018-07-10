package com.example.campnou.myapplication12;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by Administrator on 2018/7/10.
 */

public class ManageActivity extends Activity implements View.OnClickListener {

    private Button admin_activity_select;
    private Button admin_activity_add;
    private Button admin_activity_order;
    private Button admin_tip_order;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);
        initView();
    }

    private void initView() {
        admin_activity_select = (Button) findViewById(R.id.admin_activity_select);
        admin_activity_add = (Button) findViewById(R.id.admin_activity_add);
        admin_activity_order = (Button) findViewById(R.id.admin_activity_order);

        admin_activity_select.setOnClickListener(this);
        admin_activity_add.setOnClickListener(this);
        admin_activity_order.setOnClickListener(this);
        admin_tip_order = (Button) findViewById(R.id.admin_tip_order);
        admin_tip_order.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();

        switch (v.getId()) {
            case R.id.admin_activity_select:
                intent.setClass(ManageActivity.this, StudentListActivity.class);
                startActivity(intent);
                break;
            case R.id.admin_activity_add:
                intent.setClass(ManageActivity.this, StudentScoreActivity.class);
                startActivity(intent);
                break;
            case R.id.admin_activity_order:
                intent.setClass(ManageActivity.this, StudentListActivity.class);
                startActivity(intent);
                break;
            case R.id.admin_tip_order:
                intent.setClass(ManageActivity.this, TipsActivity.class);
                startActivity(intent);
                break;
        }
    }
}

