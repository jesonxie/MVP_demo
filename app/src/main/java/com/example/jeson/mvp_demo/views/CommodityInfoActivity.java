package com.example.jeson.mvp_demo.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jeson.mvp_demo.R;
import com.example.jeson.mvp_demo.Utils.CustomToast;
import com.example.jeson.mvp_demo.contract.CommodityInfoContract;
import com.example.jeson.mvp_demo.model.CommodityInfoModel;
import com.example.jeson.mvp_demo.presenter.CommodityInfoPresenter;

public class CommodityInfoActivity extends AppCompatActivity implements CommodityInfoContract.CommodityView {

    private TextView tv_name;
    private TextView tv_id;
    private TextView tv_price;

    private CommodityInfoContract.CommodityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commodity_info);

        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_id = (TextView) findViewById(R.id.tv_id);
        tv_price = (TextView) findViewById(R.id.tv_price);

        //创建presenter对象
        new CommodityInfoPresenter(this);
        presenter.start();
    }

    @Override
    public void setPresenter(CommodityInfoContract.CommodityPresenter presnter) {
        this.presenter = presnter;
    }

    @Override
    public void showLoading() {
        CustomToast.showShort(this, "正在加载商品信息");
    }

    @Override
    public void dismissLoading() {
        CustomToast.showShort(this, "商品信息加载完成");
    }

    @Override
    public String loadUserId() {
        return "1000";      //假设需要查询的用户信息的userId是1000
    }

    @Override
    public void showCommodityInfo(CommodityInfoModel commodityInfoModel) {
        if (commodityInfoModel != null) {
            tv_name.setText(commodityInfoModel.getName());
            tv_id.setText(commodityInfoModel.getId() + "");
            tv_price.setText(commodityInfoModel.getPrice() + "");
        }
    }
}
