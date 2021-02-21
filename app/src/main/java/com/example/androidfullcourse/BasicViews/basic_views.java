package com.example.androidfullcourse.BasicViews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.androidfullcourse.R;

//getcheckedRadiobutton() is use for Radio group
//ischecked() is use for checkbox

public class basic_views extends AppCompatActivity {
    EditText name;
    Button save;
    CheckBox is_active_on_SocialAcc,is_active_on_linkedin;
    RadioGroup more_detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_views);
        name=findViewById(R.id.name);
        save=findViewById(R.id.save);
        is_active_on_SocialAcc=findViewById(R.id.is_active_on_social_acc);
        is_active_on_linkedin=findViewById(R.id.is_active_on_linkedin);
        more_detail=findViewById(R.id.more_details);

        save.setOnClickListener(view -> {
            Toast.makeText(this, "Your name is: "+name.getText(), Toast.LENGTH_SHORT).show();
            if(is_active_on_SocialAcc.isChecked()) //setChecked() is use to set check
            {
                Toast.makeText(this, "active on social account", Toast.LENGTH_SHORT).show();
            }
            else if(is_active_on_linkedin.isChecked()){
                Toast.makeText(this, "active on linkedin account", Toast.LENGTH_SHORT).show();
            }
            int id=more_detail.getCheckedRadioButtonId();
            RadioButton details=findViewById(id);
            if(id==-1)
            {
                Toast.makeText(this, "Nothing is selected", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, " "+details.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}