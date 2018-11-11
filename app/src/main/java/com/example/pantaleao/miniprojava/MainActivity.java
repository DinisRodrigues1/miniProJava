package com.example.pantaleao.miniprojava;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    drawPanel v;
    String colorCode;
    TextView s;


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

    public void colorSel(View view){
        s = findViewById(R.id.teste);
        colorCode = (String)findViewById(R.id.btnBlack).getTag();
        if (colorCode.equals(String.valueOf(android.R.color.black))){
            s.setText("wow cool");
        }
        //if colorSel(cor) == selectedCol else: alterar colorSel

        //
    }
}