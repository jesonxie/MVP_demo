package com.example.jeson.mvp_demo.presenter;

import android.os.Handler;

import com.example.jeson.mvp_demo.contract.UserInfoContract;
import com.example.jeson.mvp_demo.model.UserInfoModel;

/**
 * Created by jeson on 17-4-17.
 */

public class UserInfoPresenter implements UserInfoContract.Presenter {

    private UserInfoContract.View view;

    public UserInfoPresenter(UserInfoContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void loadUserInfo() {
        String userId = view.loadUserId();
        view.showLoading();

        //这里模拟接口请求回调
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //模拟接口返回的json，并转换为javaBean
                UserInfoModel userInfoModel = new UserInfoModel("小宝", 10, "杭州");
                view.showUserInfo(userInfoModel);
                view.dismissLoading();
            }
        }, 3000);
    }

    @Override
    public void start() {
        loadUserInfo();
    }
}
