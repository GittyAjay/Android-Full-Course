package com.example.androidfullcourse.Fragment.singleFrame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

import com.example.androidfullcourse.R;

public class single_frame_fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_frame_fragment);
    }

    @Override
    public void onConfigurationChanged(@NonNull  Configuration configuration) {
        super.onConfigurationChanged(configuration);
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();

        if(configuration.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            LM_fragment lm_fragment=new LM_fragment();//landscape mode
            fragmentTransaction.replace(android.R.id.content,lm_fragment);
            Toast.makeText(this, "Landscape", Toast.LENGTH_SHORT).show();
        }else if(configuration.orientation==Configuration.ORIENTATION_PORTRAIT)
        {
            PM_fragment pm_fragment=new PM_fragment();
            fragmentTransaction.replace(android.R.id.content,pm_fragment);//portrait mode
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
        fragmentTransaction.commit();//don't forget
    }
}