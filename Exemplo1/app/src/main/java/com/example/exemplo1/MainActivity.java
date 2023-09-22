package com.example.exemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editValor1;
    EditText editValor2;

    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("OnCreate", "entrou no oncreate");
        setContentView(R.layout.activity_main);
        editValor1 = (EditText) findViewById(R.id.editValor1);
        editValor2 = (EditText) findViewById(R.id.editValor2);
        txtResultado = findViewById(R.id.textResultado);
    }

    @Override
    protected void onStart() {
      super.onStart();
      Log.i("OnResume", "entrou no onResumo");
    }

    public void BtnSoma(View view){
        int valor1 = Integer.parseInt(editValor1.getText().toString());
        int valor2 = Integer.parseInt(editValor2.getText().toString());

        txtResultado.setText(String.valueOf(valor1 + valor2));
    }

    public void BtnSub(View view){
        int valor1 = Integer.parseInt(editValor1.getText().toString());
        int valor2 = Integer.parseInt(editValor2.getText().toString());

        txtResultado.setText(String.valueOf(valor1 - valor2));
    }

    public void BtnDiv(View view){
        int valor1 = Integer.parseInt(editValor1.getText().toString());
        int valor2 = Integer.parseInt(editValor2.getText().toString());

        txtResultado.setText(String.valueOf(valor1 / valor2));
    }

    public void BtnMulti(View view){
        int valor1 = Integer.parseInt(editValor1.getText().toString());
        int valor2 = Integer.parseInt(editValor2.getText().toString());

        txtResultado.setText(String.valueOf(valor1 * valor2));
    }



}