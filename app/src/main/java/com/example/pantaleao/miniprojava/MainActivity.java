package com.example.pantaleao.miniprojava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    drawPanel v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = findViewById(R.id.painel);
    }
    public void f(View vs)
    {
        v.setfigure(1);
        v.invalidate();
    }
}