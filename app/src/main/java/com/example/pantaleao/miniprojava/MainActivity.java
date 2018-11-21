package com.example.pantaleao.miniprojava;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    // Declaration of global vars
    private drawPanel panel;
    private String colorCode;
    private Spinner spinner;
    private String selItem;
    private Circulo circulo;
    private SegmentoReta reta;
    private Poligono mypol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Lock screen orientation
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        // Get layout components
        setContentView(R.layout.activity_main);
        panel = findViewById(R.id.painel);
        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        // Init the figures objects
        circulo = new Circulo();
        reta = new SegmentoReta();
        mypol = new Poligono();

        // Add items to the spinner
        List<String> options = new ArrayList<String>();
        options.add("Reta");
        options.add("Circulo");
        options.add("Triangulo");
        options.add("Poly4");
        options.add("Poly5");

        ArrayAdapter<String> adapter = new  ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, options);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        panel.setOnTouchListener(handleCanvasTouchListener);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        // On selecting a spinner item
        selItem = parent.getItemAtPosition(pos).toString();
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    // Canvas Touch Listener
    @SuppressLint("ClickableViewAccessibility")
    private View.OnTouchListener handleCanvasTouchListener = new View.OnTouchListener(){
        public boolean onTouch(View view, MotionEvent event) {
            if (selItem.equals("Triangulo")){
                panel.invalidate();
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(mypol.getLista().size() < 3){
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
            else if (selItem.equals("Reta")) {
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
            } else if (selItem.equals("Poly4")){
                panel.invalidate();
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(mypol.getLista().size() < 4){
                        mypol.add(new Ponto2D(event.getX(),event.getY()));
                    }
                    if(mypol.getLista().size()== 4){
                        panel.invalidate();
                        panel.setfigure(4,mypol.getLista().get(0),mypol.getLista().get(1),mypol.getLista().get(2),mypol.getLista().get(3));
                        panel.invalidate();
                        mypol.getLista().clear();
                    }
                }
            } else {
                panel.invalidate();
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    if(mypol.getLista().size() < 5){
                        mypol.add(new Ponto2D(event.getX(),event.getY()));
                    }
                    if(mypol.getLista().size()== 5){
                        panel.invalidate();
                        panel.setfigure(5,mypol.getLista().get(0),mypol.getLista().get(1),mypol.getLista().get(2),mypol.getLista().get(3),mypol.getLista().get(4));
                        panel.invalidate();
                        mypol.getLista().clear();
                    }
                }
            }
            return false;
        }
    };

    //Onclick for spinner
   public void colorSel(View view){
        Context context = getApplicationContext();
            switch (view.getId()) {

                case R.id.btnBlack:
                    colorCode = "#000000";
                    panel.setcolor(colorCode);
                    panel.invalidate();
                    Toast.makeText(context, "Black Selected", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnBlue:
                    colorCode = "#0000FF";
                    panel.setcolor(colorCode);
                    panel.invalidate();
                    Toast.makeText(context, "Blue Selected", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnGreen:
                    colorCode = "#008000";
                    panel.setcolor(colorCode);
                    panel.invalidate();
                    Toast.makeText(context, "Green Selected", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnRed:
                    colorCode = "#FF0000";
                    panel.setcolor(colorCode);
                    panel.invalidate();
                    Toast.makeText(context, "Red Selected", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnClear:
                    mypol.getLista().clear();
                    panel.invalidate();
                    panel.clearcanvas(6);
                    Toast.makeText(context, "Cleared Interface", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnAbout:
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("About");
                    builder.setMessage("Para criar um poligono escolha a sua opção e carregue no " +
                            "ecrã para criar os diversos pontos. \n" +
                            "Para criar um circulo clique e " +
                            "arraste com a opção de circulo selecionada. \n" +
                            "Para criar uma linha " +
                            "clique e arraste de modo a criá-la.");
                    builder.show();

                    break;
            }

        }

}
