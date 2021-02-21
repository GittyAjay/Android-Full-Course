package com.example.androidfullcourse.Fragment.communication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.androidfullcourse.R;

public class fragment_communication extends AppCompatActivity  implements frag_a.FragmentAListner, frag_b.FragmentBListner{ //press cntrl+i

    private frag_a f_a;
    private frag_b f_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_communication);
        f_a=new frag_a();
        f_b=new frag_b();
        FragmentTransaction f_t=getSupportFragmentManager().beginTransaction();
        f_t.replace(R.id.frag_container_1,f_a);
        f_t.replace(R.id.frag_container_2,f_b);
        f_t.commit();
    }

    @Override
    public void onInputBSequence(CharSequence input) {
        f_a.updateEditText(input);
    }

    @Override
    public void onInputASequence(CharSequence input) {
        f_b.updateEditText(input);
    }
}