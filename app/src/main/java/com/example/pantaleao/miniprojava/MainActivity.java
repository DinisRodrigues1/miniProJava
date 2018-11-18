package com.example.pantaleao.miniprojava;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    drawPanel v;
    String colorCode;
    String selColor;
    TextView s;
    Spinner spinner;
    public static String colorVal;
    public static String selItem;
    public static double selX;
    public static double selY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = findViewById(R.id.painel);
        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        addTouchListener();


        List<String> options = new ArrayList<String>();
        options.add("Reta");
        options.add("Circulo");
        options.add("Poligono");
        //options.add("outro");

        ArrayAdapter<String> adapter = new  ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

    }

    @SuppressLint("ClickableViewAccessibility")
    public void addTouchListener() {
        drawPanel painel = findViewById(R.id.painel);

        painel.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    double x = event.getX();
                    double y = event.getY();
                    Ponto2D p1 = new Ponto2D(x, y);
                    s = findViewById(R.id.teste);
                    s.setText(p1.toString());
                    selX = x;
                    selY = y;
                }
               /* s = findViewById(R.id.teste);
                String nx = Double.toString(x);
                s.setText(nx);*/

                return false;
            }
        });
    }

    public void f(View vs)
    {
        v.setfigure(1);
        v.invalidate();
    }

    public void colorSel(View view){
        Context context = getApplicationContext();
            switch (view.getId()) {

                case R.id.btnBlack:
                    colorCode = (String)findViewById(R.id.btnBlack).getTag();
                    colorVal = colorCode;
                    Toast.makeText(context, colorCode, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnBlue:
                    colorCode = (String)findViewById(R.id.btnBlue).getTag();
                    colorVal = colorCode;
                    Toast.makeText(context, colorCode, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnGreen:
                    colorCode = (String)findViewById(R.id.btnGreen).getTag();
                    colorVal = colorCode;
                    Toast.makeText(context, colorCode, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnRed:
                    colorCode = (String)findViewById(R.id.btnRed).getTag();
                    colorVal = colorCode;
                    Toast.makeText(context, colorCode, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnClear:
                    colorCode = (String)findViewById(R.id.btnBlack).getTag(); // TODO WITH CLEAR AND ABOUT
                    colorVal = colorCode;
                    Toast.makeText(context, colorCode, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnAbout:
                    colorCode = (String)findViewById(R.id.btnBlack).getTag(); // TODO WITH CLEAR AND ABOUT
                    colorVal = colorCode;
                    Toast.makeText(context, colorCode, Toast.LENGTH_LONG).show();
                    break;
            }
        s = findViewById(R.id.teste);
        colorCode = (String)findViewById(R.id.btnBlack).getTag();

        if (colorCode.equals(String.valueOf(android.R.color.black))) {

           // s.setText("wow cool");
        }
        //if colorSel(cor) == selectedCol else: alterar colorSel

        //
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(pos).toString();
        selItem = item; //ACCESS BY OTHER CLASS NAME .getVariable();
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

  /*  public void canvasClick (View v) {
        s = findViewById(R.id.teste);
        s.setText("nice");

    } */


}
