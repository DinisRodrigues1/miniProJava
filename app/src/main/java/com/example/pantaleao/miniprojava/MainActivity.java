package com.example.pantaleao.miniprojava;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    drawPanel v;
    String colorCode;
    String item;
    TextView s;
    Spinner spinner;
    public static String colorVal;
    public static double selX;
    public static double selY;
    public static String selItem;
    public Poligono mypol;
    private Circulo circulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mypol = new Poligono();
        circulo = new Circulo();
        setContentView(R.layout.activity_main);
        v = findViewById(R.id.painel);
        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        addTouchListener();


        List<String> options = new ArrayList<String>();
        options.add("Reta");
        options.add("Circulo");
        options.add("Poligono");

        ArrayAdapter<String> adapter = new  ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

    }

    @SuppressLint("ClickableViewAccessibility")
    public void addTouchListener() {
        drawPanel painel = findViewById(R.id.painel);
        painel.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent event) {
                if (selItem.equals("Poligono")){
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        double x = event.getX();
                        double y = event.getY();
                        Ponto2D p1 = new Ponto2D(x, y);
                        mypol.add(p1);
                        s = findViewById(R.id.teste);
                        s.setText(mypol.lista.toString());
                        selX = x;
                        selY = y;
                    }
                }
                else if (selItem.equals("Circulo")) {
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                       if(circulo.isZeroPoints()){
                           circulo.setPointOne(new Ponto2D(event.getX(),event.getY()));
                       }else{
                           circulo.setPointTwo(new Ponto2D(event.getX(),event.getY()));
                           circulo.calcCenter();
                           // TODO
                           //Dezenhar circulo
                       }
                    }
                }
                else {

                }


                return false;
            }
        });
    }


    public void colorSel(View view){
        Context context = getApplicationContext();
            switch (view.getId()) {

                case R.id.btnBlack:
                    colorCode = (String)findViewById(R.id.btnBlack).getTag();
                    colorVal = "#000000";
                    Toast.makeText(context, colorCode, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnBlue:
                    colorCode = (String)findViewById(R.id.btnBlue).getTag();
                    colorVal = "#0000FF";

                    Toast.makeText(context, colorCode, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnGreen:
                    colorCode = (String)findViewById(R.id.btnGreen).getTag();
                    colorVal = "#008000";
                    Toast.makeText(context, colorCode, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnRed:
                    colorCode = (String)findViewById(R.id.btnRed).getTag();
                    colorVal = colorCode;
                    Toast.makeText(context, colorCode, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnClear:
                    mypol.lista.clear();

                    colorCode = (String)findViewById(R.id.btnClear).getTag();
                    Toast.makeText(context, "Cleared Interface", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnAbout:
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("About");
                    builder.setMessage("Para criar um poligono selecione a sua opção e carregue no " +
                            "ecrã para criar os diversos pontos. \n" +
                            "Para criar um circulo clique e " +
                            "arraste com a opção de circulo selecionada. \n" +
                            "Para criar uma linha " +
                            "clique e arraste de modo a criá-la.");
                    builder.show();

                    break;
            }
        s = findViewById(R.id.teste);

        }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        // On selecting a spinner item
        item = parent.getItemAtPosition(pos).toString();

        s = findViewById(R.id.teste);
        s.setText(item);
        if (item.equals("Poligono")) {
            Toast.makeText(getApplicationContext(), "poligono", Toast.LENGTH_SHORT).show();
            selItem = item;
        }
        else if (item.equals("Circulo")){
            Toast.makeText(getApplicationContext(), "circulo", Toast.LENGTH_SHORT).show();
            selItem = item;
        }
        else{
            Toast.makeText(getApplicationContext(), "reta", Toast.LENGTH_SHORT).show();
            selItem = item;
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

}
