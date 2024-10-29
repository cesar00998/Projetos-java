package com.cesaraugusto.projeto10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView btimc, bttelagas, bttelacal, bttelaoutros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btimc = findViewById(R.id.app_imc);
        bttelagas = findViewById(R.id.app_gasolina);
        bttelacal = findViewById(R.id.app_calculadora);
        bttelaoutros= findViewById(R.id.app_outros);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void  abrirAppImc(View view){
        Intent telaimc = new Intent( MainActivity.this, ImcActivity.class);
        startActivity(telaimc);
    }
}