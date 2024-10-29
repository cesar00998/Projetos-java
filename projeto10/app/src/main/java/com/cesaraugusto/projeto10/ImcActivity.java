package com.cesaraugusto.projeto10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class ImcActivity extends AppCompatActivity {

    private TextInputEditText editpeso, editAltura;
    private Button btncalc, btnlimpar;
    double imc, peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_imc);

        editpeso = findViewById(R.id.edit_peso);
        editAltura = findViewById(R.id.edit_altura);
        btncalc = findViewById(R.id.calcular);
        btnlimpar = findViewById(R.id.limpar);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void calcimc(View view) {

        peso = (Double.parseDouble(editpeso.getText().toString()));
        altura = (Double.parseDouble(editAltura.getText().toString()));

        altura = altura / 100;

        imc = peso / (altura + altura);

        if (imc < 17) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle("calcular imc");

            alerta.setMessage("seu imc é de " + imc + "-muito baixo");

            alerta.setNeutralButton("ok", null);


            alerta.create();
            alerta.show();

        } else if (imc >= 17 && imc < 18.5) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle("calcular imc");

            alerta.setMessage("seu imc é de " + imc + "- baixo");

            alerta.setNeutralButton("ok", null);


            alerta.create();
            alerta.show();
        } else if (imc >= 18.5 && imc < 25) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle("calcular imc");

            alerta.setMessage("seu imc é de " + imc + "-peso normal");

            alerta.setNeutralButton("ok", null);


            alerta.create();
            alerta.show();

        } else if (imc >= 25 && imc < 30) {
            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle("calcular imc");

            alerta.setMessage("seu imc é de " + imc + "-acima do peso");

            alerta.setNeutralButton("ok", null);


            alerta.create();
            alerta.show();

        } else if (imc >= 30 && imc < 35) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle("calcular imc");

            alerta.setMessage("seu imc é de " + imc + "-obsidade1");

            alerta.setNeutralButton("ok", null);


            alerta.create();
            alerta.show();
        } else if (imc >= 40 && imc < 55) {

            AlertDialog.Builder alerta = new AlertDialog.Builder(this);

            alerta.setTitle("calcular imc");

            alerta.setMessage("seu imc é de " + imc + "-obsidade 2");

            alerta.setNeutralButton("ok", null);


            alerta.create();
            alerta.show();
        }else {


                AlertDialog.Builder alerta = new AlertDialog.Builder(this);

                alerta.setTitle("calcular imc");

                alerta.setMessage("seu imc é de " + imc + "-obsidade3");

                alerta.setNeutralButton("ok", null);


                alerta.create();
                alerta.show();

        }

    }

    public void limpeimc (View view){

        editpeso.setText("");
        editAltura.setText("");

        peso = 0;
        altura = 0 ;
        imc = 0;
    }
}