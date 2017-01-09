package com.example.administrator.fragment_test;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {
    private  ParseData myInterface;
    private Spinner spinner;
    private String[] data = {"New York","Xi'an","BaoJi"};
    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_top, container, false);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(),R.layout.support_simple_spinner_dropdown_item,data);
        spinner = (Spinner) v.findViewById(R.id.spinner);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String str = spinner.getSelectedItem().toString();
                myInterface.showPlace(str);
                System.out.println(str);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myInterface = (ParseData) context;
    }

    public interface ParseData{
        public void showPlace(String place);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        myInterface = null;
    }
}
