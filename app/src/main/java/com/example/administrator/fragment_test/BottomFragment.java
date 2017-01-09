package com.example.administrator.fragment_test;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {

    TextView textView;

    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_bottom, container, false);
        textView = (TextView) v.findViewById(R.id.result);
        return v;
    }

    public void displayResult(String result) {
        textView.setText(result);
    }

}
