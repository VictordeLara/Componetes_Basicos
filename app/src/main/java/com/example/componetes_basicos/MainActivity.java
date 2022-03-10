package com.example.componetes_basicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void enviar(View view){

        EditText campoNome = findViewById(R.id.editNome);
        TextInputEditText campoEmail = findViewById(R.id.editEmail);
        TextView textResultado = findViewById(R.id.textResultado);
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textResultado.setText( "Nome : "+ nome +" Email : " + email );
    }

}