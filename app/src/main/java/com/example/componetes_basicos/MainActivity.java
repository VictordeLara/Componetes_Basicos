package com.example.componetes_basicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textResultado;

    private CheckBox checkVermelho, checkVerde, checkBranco ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome           = findViewById(R.id.editNome);
        campoEmail          = findViewById(R.id.editEmail);
        textResultado       = findViewById(R.id.textResultado);

        //checkbox
        checkVermelho       = findViewById(R.id.checkVermelho);
        checkVerde          = findViewById(R.id.checkVerde);
        checkBranco         = findViewById(R.id.checkBranco);

    }
    public void checkbox(){
        String texto = "";
        if(checkVermelho.isChecked()) {
            String corSelecionada = checkVermelho.getText().toString();
            texto = corSelecionada;
            //texto = " Vermelho selecionado - ";
        }
        textResultado.setText(texto);
        if(checkVerde.isChecked()){
            texto = texto + "- Verde selecionado - ";}
        textResultado.setText(texto);
        if(checkBranco.isChecked()){
            texto = texto + "- Branco selecionado - ";}
        textResultado.setText(texto);


    }

    public void enviar(View view){

        checkbox();
        /*
        String nome         = campoNome.getText().toString();
        String email        = campoEmail.getText().toString();
        textResultado.setText( "Nome : "+ nome +" Email : " + email );
        */
    }


    public void limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");
        textResultado.setText("");

    }

}