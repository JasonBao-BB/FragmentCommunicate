package com.example.administrator.fragment_test;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TopFragment.ParseData {

    TextView textView;
    BottomFragment bottomFragment;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);

        bottomFragment = new BottomFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.container,new TopFragment())
                .add(R.id.buttomContainer,bottomFragment)
                .commit();

        getSupportFragmentManager().beginTransaction().add(R.id.container,new TopFragment()).commit();
    }

    @Override
    public void showPlace(String place) {
        this.textView.setText(place);
        bottomFragment.displayResult(place);
    }
}
