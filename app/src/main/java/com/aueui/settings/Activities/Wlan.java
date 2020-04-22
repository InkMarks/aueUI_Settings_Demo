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

public class Wlan extends BaseActivity {
    private LinearLayout wlan_details;
    private Object view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wlan);
        initView();
        wlan_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(Wlan.this, Wlan_details.class));
                } catch (Exception e) {
                }
            }
        });
        Button btn_back = findViewById(R.id.wlan_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Wlan.this, Netowrk.class));
            }
        });

    }

    private void initView() {
        wlan_details = findViewById(R.id.wlan_details);}}