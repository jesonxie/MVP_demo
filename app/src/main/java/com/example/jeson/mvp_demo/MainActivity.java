package com.example.jeson.mvp_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jeson.mvp_demo.views.CommodityInfoActivity;
import com.example.jeson.mvp_demo.views.UserInfoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        Button btn_mvp = (Button) findViewById(R.id.btn_mvp);
        btn_mvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserInfoActivity.class);
                startActivity(intent);
            }
        });

        Button btn_commodity = (Button) findViewById(R.id.btn_to_commodity);
        btn_commodity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CommodityInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
