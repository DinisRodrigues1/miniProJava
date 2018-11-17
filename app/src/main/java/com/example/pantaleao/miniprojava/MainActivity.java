package com.example.pantaleao.miniprojava;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    drawPanel v;
    String colorCode;
    TextView s;
    Spinner spinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = findViewById(R.id.painel);
        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        List<String> options = new ArrayList<String>();
        options.add("Reta");
        options.add("Circulo");
        options.add("Poligono");
        //options.add("outro");

        ArrayAdapter<String> adapter = new  ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

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

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(pos).toString();

        // Showing selected spinner item
        s = findViewById(R.id.teste);
        s.setText(item);
        //Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
       /* if (item == "Poligono") {
            //faz cenas de poligono
        }
        else{
            //outras cenas
        }
*/
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }



}