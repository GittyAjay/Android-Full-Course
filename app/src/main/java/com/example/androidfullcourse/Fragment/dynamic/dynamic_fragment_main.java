package com.example.androidfullcourse.Fragment.dynamic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidfullcourse.R;

public class dynamic_fragment_main extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment_main);
        b=findViewById(R.id.add_fragment);
        b.setOnClickListener(view -> {
            Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
            FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            dynamic_fragment d_f=new dynamic_fragment();
            fragmentTransaction.add(R.id.fragment_container,d_f);//instead of replace
            fragmentTransaction.commit();
        });
    }
}