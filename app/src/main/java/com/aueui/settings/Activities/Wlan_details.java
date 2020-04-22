package com.aueui.settings.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.aueui.settings.Base.BaseActivity;
import com.aueui.settings.R;

public class Wlan_details extends BaseActivity {

    private Object view;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wlan_details);
        Button btn_back = findViewById(R.id.wlan_details_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Wlan_details.this, Wlan.class));
            }
        });

    }
}