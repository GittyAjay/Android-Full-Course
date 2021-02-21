package com.example.androidfullcourse.Fragment.singleFrame;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidfullcourse.R;

public class LM_fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_l_m_fragment, container, false);
        //attach to root=false //right now you are not adding this,you will add in programing time
    }
}