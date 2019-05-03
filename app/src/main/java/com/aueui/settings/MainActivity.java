package com.aueui.settings;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;

import com.aueui.settings.Activities.About;
import com.aueui.settings.Base.BaseActivity;

public class MainActivity extends BaseActivity {
    private LinearLayout wifi_l, connected_device_l, app_l, battery_l, display, sound, storage, safe, about;
    private Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        wifi_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
            }
        });
        app_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS));
            }
        });
        battery_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Settings.ACTION_BATTERY_SAVER_SETTINGS));
            }
        });
        connected_device_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Settings.ACTION_BLUETOOTH_SETTINGS));
            }
        });
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Settings.ACTION_DISPLAY_SETTINGS));
            }
        });
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Settings.ACTION_SOUND_SETTINGS));
            }
        });
        storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Settings.ACTION_INTERNAL_STORAGE_SETTINGS));
            }
        });
        safe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Settings.ACTION_SECURITY_SETTINGS));
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(Settings.ACTION_SEARCH_SETTINGS));
                } catch (Exception e) {
                }
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(MainActivity.this, About.class));
                } catch (Exception e) {
                }
            }
        });
    }

    private void initView() {
        wifi_l = findViewById(R.id.wifi_l);
        connected_device_l = findViewById(R.id.connected_device_l);
        app_l = findViewById(R.id.app_l);
        battery_l = findViewById(R.id.battery_l);
        display = findViewById(R.id.display);
        sound = findViewById(R.id.sound);
        storage = findViewById(R.id.storage);
        safe = findViewById(R.id.safe);
        search = findViewById(R.id.search);
        about = findViewById(R.id.about);
    }
}
