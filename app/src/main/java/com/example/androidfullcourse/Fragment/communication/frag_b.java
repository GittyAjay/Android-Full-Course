package com.example.androidfullcourse.Fragment.communication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.androidfullcourse.R;

public class frag_b extends Fragment {

    private EditText text;
    private Button submit;
    private FragmentBListner listner;

    public interface FragmentBListner{
        void onInputBSequence(CharSequence input);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_frag_b, container, false);
        text=v.findViewById(R.id.get_text);
        submit=v.findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence c=text.getText();
                listner.onInputBSequence(c);
            }
        });
        return v;
    }
    public void updateEditText(CharSequence new_text)
    {
        text.setText(new_text);
    }

    @Override
    public void onAttach(@NonNull  Context context) {
        super.onAttach(context);

        if(context instanceof FragmentBListner)
        {
            listner= (FragmentBListner)context;
        }
        else
        {
            throw new RuntimeException(context.toString()
                    +"Must Implement Fragment B Listner");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listner=null;
    }
}