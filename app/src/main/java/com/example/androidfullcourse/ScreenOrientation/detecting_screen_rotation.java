package com.example.androidfullcourse.ScreenOrientation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.androidfullcourse.R;

public class detecting_screen_rotation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detecting_screen_rotation);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        System.out.println("orientation---"+getResources().getConfiguration().orientation);
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.i("ORIENTATION_LANDSCAPE", "ORIENTATION_LANDSCAPE");
            Toast.makeText(getBaseContext(), "ORIENTATION_LANDSCAPE", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.i("ORIENTATION_PORTRAIT", "ORIENTATION_PORTRAIT");
            Toast.makeText(getBaseContext(), "ORIENTATION_PORTRAIT", Toast.LENGTH_SHORT).show();
        }
    }
}