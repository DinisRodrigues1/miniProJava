package com.example.pantaleao.miniprojava;

import android.annotation.SuppressLint;
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


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private drawPanel panel;
    private String colorCode;
    private String item;
    private TextView test;
    private Spinner spinner;
    private String selItem;
    private Circulo circulo;
    private SegmentoReta reta;
    private Poligono mypol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // TODO mypol = new Poligono();
        circulo = new Circulo();
        reta = new SegmentoReta();
        mypol = new Poligono();
        setContentView(R.layout.activity_main);
        panel = findViewById(R.id.painel);
        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        List<String> options = new ArrayList<String>();
        options.add("Reta");
        options.add("Circulo");
        options.add("Poligono");

        ArrayAdapter<String> adapter = new  ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        addTouchListener();
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        // On selecting a spinner item
        item = parent.getItemAtPosition(pos).toString();

        test = findViewById(R.id.teste);
        test.setText(item);
        if (item.equals("Poligono")) {
            //Toast.makeText(getApplicationContext(), "poligono", Toast.LENGTH_SHORT).show();
            selItem = item;
        }
        else if (item.equals("Circulo")){
            //Toast.makeText(getApplicationContext(), "circulo", Toast.LENGTH_SHORT).show();
            selItem = item;
        }
        else{
            //Toast.makeText(getApplicationContext(), "reta", Toast.LENGTH_SHORT).show();
            selItem = item;
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }


    @SuppressLint("ClickableViewAccessibility")
    public void addTouchListener() {
        panel.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent event) {

                if (selItem.equals("Poligono")){
                    panel.invalidate();
                   if (event.getAction() == MotionEvent.ACTION_DOWN) {
                      if(mypol.getLista().size() < 3){
                          Toast.makeText(getApplicationContext(), "poligono add", Toast.LENGTH_SHORT).show();
                          mypol.add(new Ponto2D(event.getX(),event.getY()));
                      }
                      if(mypol.getLista().size()==3){
                          panel.invalidate();
                          panel.setfigure(3,mypol.getLista().get(0),mypol.getLista().get(1),mypol.getLista().get(2));
                          panel.invalidate();
                          mypol.getLista().clear();
                      }
                    }
                }
                else if (selItem.equals("Circulo")) {
                    panel.invalidate();
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if(circulo.isZeroPoints()){
                            circulo.setPointOne(new Ponto2D(event.getX(),event.getY()));
                        }else{
                            circulo.setPointTwo(new Ponto2D(event.getX(),event.getY()));
                            circulo.calc();
                            panel.invalidate();
                            panel.setfigure(2,circulo.getCenter() ,circulo.getRaio());
                            panel.invalidate();
                        }
                    }
                }
                else {
                    panel.invalidate();
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        if(reta.isZeroPoints()){
                            reta.setA(new Ponto2D(event.getX(),event.getY()));
                        }else{
                            reta.setB(new Ponto2D(event.getX(),event.getY()));
                            panel.invalidate();
                            panel.setfigure(1, reta.getA() ,reta.getB());
                            panel.invalidate();
                        }
                    }
                }
                return false;
            }
        });
    }


  /*  public void colorSel(View view){
        Context context = getApplicationContext();
            switch (view.getId()) {

                case R.id.btnBlack:
                    colorCode = (String)findViewById(R.id.btnBlack).getTag();
                    colorVal = "#000000";
                    test.setText(colorVal);
                    Toast.makeText(context, colorCode, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnBlue:
                    colorCode = (String)findViewById(R.id.btnBlue).getTag();
                    colorVal = "#0000FF";
                    test.setText(colorVal);
                    Toast.makeText(context, colorCode, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnGreen:
                    colorCode = (String)findViewById(R.id.btnGreen).getTag();
                    colorVal = "#008000";
                    test.setText(colorVal);
                    Toast.makeText(context, colorCode, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnRed:
                    colorCode = (String)findViewById(R.id.btnRed).getTag();
                    colorVal = "#FF0000";
                    test.setText(colorVal);
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
        test = findViewById(R.id.teste);

        }*/


}
