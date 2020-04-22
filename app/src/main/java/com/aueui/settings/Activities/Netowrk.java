package com.aueui.settings.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.aueui.settings.Base.BaseActivity;
import com.aueui.settings.MainActivity;
import com.aueui.settings.R;

public class Netowrk extends BaseActivity {
    private LinearLayout  wlan;
    private Object view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.netowrk);
        initView();
        wlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(Netowrk.this, Wlan.class));
                } catch (Exception e) {
                }
            }
        });
        Button btn_back = findViewById(R.id.netowrk_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Netowrk.this, MainActivity.class));
            }
        });

    }


    private void initView() {
        wlan = findViewById(R.id.wlan);}}