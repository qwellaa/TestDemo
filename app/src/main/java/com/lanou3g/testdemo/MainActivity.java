package com.lanou3g.testdemo;

import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private TextView textView;

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    // FindViewById
    @Override
    protected void initView() {
        textView = bindView(R.id.main_tv);
    }

    @Override
    protected void initData() {

    }
}
