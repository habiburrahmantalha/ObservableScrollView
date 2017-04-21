package com.tree.observablescrollview;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_holder, new ScrollviewFragment()).commit();
    }


}
