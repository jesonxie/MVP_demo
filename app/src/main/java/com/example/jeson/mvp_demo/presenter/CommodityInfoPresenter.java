package com.example.jeson.mvp_demo.presenter;

import android.os.Handler;

import com.example.jeson.mvp_demo.contract.CommodityInfoContract;
import com.example.jeson.mvp_demo.model.CommodityInfoModel;

/**
 * Created by jeson on 17-4-17.
 */

public class CommodityInfoPresenter implements CommodityInfoContract.CommodityPresenter {

    private CommodityInfoContract.CommodityView view;

    public CommodityInfoPresenter(CommodityInfoContract.CommodityView view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        loadCommodityInfo();
    }

    @Override
    public void loadCommodityInfo() {
        String userId = view.loadUserId();
        view.showLoading();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                CommodityInfoModel commodityInfoModel = new CommodityInfoModel("苹果", 001, 2.15f);
                view.showCommodityInfo(commodityInfoModel);
                view.dismissLoading();
            }
        }, 5000);
    }


}
