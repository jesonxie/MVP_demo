package com.example.jeson.mvp_demo.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.jeson.mvp_demo.R;
import com.example.jeson.mvp_demo.Utils.CustomToast;
import com.example.jeson.mvp_demo.contract.UserInfoContract;
import com.example.jeson.mvp_demo.model.UserInfoModel;
import com.example.jeson.mvp_demo.presenter.UserInfoPresenter;

/**
 * Created by jeson on 17-4-17.
 */

public class UserInfoActivity extends AppCompatActivity implements UserInfoContract.View {

    private static final String LOG_TAG = UserInfoActivity.class.getName();

    private TextView tv_name;
    private TextView tv_age;
    private TextView tv_address;

    private UserInfoContract.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_age = (TextView) findViewById(R.id.tv_age);
        tv_address = (TextView) findViewById(R.id.tv_address);

        //创建presenter对象
        new UserInfoPresenter(this);
        presenter.start();
    }

    @Override
    public String loadUserId() {
        return "1000";      //假设需要查询的用户信息的userId是1000
    }

    @Override
    public void showUserInfo(UserInfoModel userInfoModel) {
        if (userInfoModel != null) {
            tv_name.setText(userInfoModel.getName());
            tv_age.setText(userInfoModel.getAge() + "");
            tv_address.setText(userInfoModel.getAddress());
        }
    }

    @Override
    public void showLoading() {
        CustomToast.showShort(this, "正在加载");
    }

    @Override
    public void dismissLoading() {
        CustomToast.showShort(this, "加载完成");
    }


    @Override
    public void setPresenter(UserInfoContract.Presenter presenter) {
        this.presenter = presenter;
    }

}
