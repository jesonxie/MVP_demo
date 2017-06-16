package com.example.jeson.mvp_demo.contract;

import com.example.jeson.mvp_demo.model.UserInfoModel;
import com.example.jeson.mvp_demo.presenter.BasePresenter;

/**
 * Created by jeson on 17-4-17.
 */

public interface UserInfoContract {

    //封装了业务逻辑操作
    interface Presenter extends BasePresenter {
        void loadUserInfo();
    }

    //封装了UI操作
    interface View extends BaseView<Presenter> {
        String loadUserId();    //假设接口请求需要一个 userId

        void showLoading();     //展示加载框

        void dismissLoading();  //取消加载框

        void showUserInfo(UserInfoModel userInfoModel);     //将忘了请求得到的用户信息返回

    }
}
