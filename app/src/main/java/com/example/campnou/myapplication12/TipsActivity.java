package com.example.campnou.myapplication12;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/7/10.
 */

public class TipsActivity extends Activity implements View.OnClickListener {
    private EditText et_input;
    private Button btn_save;
    private Button btn_clear;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_tips);
        initView();
    }

    private void initView() {
        et_input = (EditText) findViewById(R.id.et_input);
        btn_save = (Button) findViewById(R.id.btn_save);
        btn_clear = (Button) findViewById(R.id.btn_clear);

        btn_save.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
    }
    //清空和提交
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_save:
                submit();
                break;
            case R.id.btn_clear:
                et_input.setText("");
                break;
        }
    }

    private void submit() {
        // validate
        String input = et_input.getText().toString().trim();
        if (TextUtils.isEmpty(input)) {
            Toast.makeText(this, "请输入内容", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }
}
