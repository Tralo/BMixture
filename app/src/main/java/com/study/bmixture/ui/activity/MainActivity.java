package com.study.bmixture.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.study.bmixture.R;
import com.study.bmixture.base.activity.BaseActivity;
import com.study.bmixture.base.presenter.BasePresenter;
import com.study.bmixture.ui.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initEventAndData() {

    }
}
