package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela2);
        TextView nome = findViewById(R.id.nome2);
        TextView idade = findViewById(R.id.idade2);
        TextView peso = findViewById(R.id.peso2);
        TextView altura = findViewById(R.id.altura2);
        TextView imc = findViewById(R.id.imc2);
        TextView clas = findViewById(R.id.clas2);
        Intent it = getIntent();
        Bundle params = it.getExtras();
        String Peso = params.getString("Peso");
        String Altura = params.getString("Altura");
        String Nome = params.getString("Nome");
        String Idade = params.getString("Idade");
        nome.setText(Nome);
        idade.setText(Idade);
        Double Pesos = Double.parseDouble(Peso);
        Double Alturas = Double.parseDouble(Altura);
        peso.setText(Peso);
        altura.setText(Altura);
        Double Imc = Pesos/(Alturas*Alturas);
        String Imcs = Double.toString(Imc);
        imc.setText(Imcs);
        if(Imc < 18.5){
            clas.setText("Abaixo do Peso");
        }
        else if(18.5 <= Imc || Imc < 24.9){
            clas.setText("Saudável");
        }
        else if(Imc >= 24.9 || Imc < 29.9){
            clas.setText("Sobrepeso");
        }
        else if(Imc >= 29.9 || Imc < 34.9){
            clas.setText("Obesidade Grau 1");
        }
        else if(Imc >= 34.9 || Imc < 39.9){
            clas.setText("Obesidade Grau 2");
        }
        else {
            clas.setText("Obesidade Grau 3");
        }
    }
    public void voltar(View view){
        finish();
    }
}
