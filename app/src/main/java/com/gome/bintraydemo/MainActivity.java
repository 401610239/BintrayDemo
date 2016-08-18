package com.gome.bintraydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gome.bintray.BinTrayTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BinTrayTest.bintraytest(this);
    }
}
