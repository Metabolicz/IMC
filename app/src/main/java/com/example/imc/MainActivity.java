package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button(View view) {
        Intent it = new Intent(getBaseContext(),Tela2.class);
        EditText nome = findViewById(R.id.edit1);
        EditText idade = findViewById(R.id.edit2);
        EditText peso = findViewById(R.id.edit3);
        EditText altura = findViewById(R.id.edit4);
        Bundle params = new Bundle();
        params.putString("Nome",nome.getText().toString());
        params.putString("Idade",idade.getText().toString());
        params.putString("Peso",peso.getText().toString());
        params.putString("Altura",altura.getText().toString());
        it.putExtras(params);
        startActivity(it);
    }
}
