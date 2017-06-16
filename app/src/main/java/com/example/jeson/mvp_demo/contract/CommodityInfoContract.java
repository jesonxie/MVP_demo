package com.example.jeson.mvp_demo.contract;

import com.example.jeson.mvp_demo.model.CommodityInfoModel;
import com.example.jeson.mvp_demo.presenter.BasePresenter;

/**
 * Created by jeson on 17-4-17.
 */

public interface CommodityInfoContract {

    interface CommodityPresenter extends BasePresenter {
        void loadCommodityInfo();
    }

    interface CommodityView extends BaseView<CommodityPresenter> {
        String loadUserId();    //假设接口请求需要一个 userId

        void showLoading();     //展示加载框

        void dismissLoading();  //取消加载框

        void showCommodityInfo(CommodityInfoModel commodityInfoModel);     //将忘了请求得到的用户信息返回
    }
}
