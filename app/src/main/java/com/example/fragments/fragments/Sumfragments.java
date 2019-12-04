package com.example.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sumfragments extends Fragment implements View.OnClickListener{


    public Sumfragments() {
        // Required empty public constructor
    }

    Button btncalculate;

    EditText etfirst,etsecond;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_sumfragments, container, false);
        etfirst=view.findViewById(R.id.etfirst);
        etsecond=view.findViewById(R.id.etsecond);
        btncalculate=view.findViewById(R.id.btncalculate);
        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return  view;
    }

    @Override
    public void onClick(View v) {
        int first=Integer.parseInt(etfirst.getText().toString());
        int second=Integer.parseInt(etsecond.getText().toString());
        int result=first+second;

        Toast.makeText(getActivity(),"sum is:"+result,Toast.LENGTH_SHORT).show();
    }
}
