package com.example.androidfullcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.androidfullcourse.BasicViews.basic_views;
import com.example.androidfullcourse.Fragment.communication.fragment_communication;
import com.example.androidfullcourse.Fragment.dynamic.dynamic_fragment_main;
import com.example.androidfullcourse.Fragment.list.list_fragment_main;
import com.example.androidfullcourse.Fragment.singleFrame.single_frame_fragment;
import com.example.androidfullcourse.Menu.menuExample;
import com.example.androidfullcourse.ScreenOrientation.detecting_screen_rotation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.basic_views).setOnClickListener(view -> {
               startActivity(new Intent(MainActivity.this, basic_views.class));
        });
        findViewById(R.id.single_frame_fragment).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, single_frame_fragment.class));
        });
        findViewById(R.id.list_fragment).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, list_fragment_main.class));
        });
        findViewById(R.id.dynamic_fragment).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, dynamic_fragment_main.class));
        });
        findViewById(R.id.frag_communication).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, fragment_communication.class));
        });
        findViewById(R.id.menu).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, menuExample.class));
        });
        findViewById(R.id.screen_rotation_detect).setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, detecting_screen_rotation.class));
        });
    }
}