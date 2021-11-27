package com.example.portobellopalacehotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private EditText edit_email, edit_senha;
    private Button bt_entrar;
    private Button bt_sem;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IniciarComponentes();
        getSupportActionBar().hide();

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = edit_email.getText().toString();
                String senha = edit_senha.getText().toString();

                if (nome.isEmpty() || senha.isEmpty()){
                    Snackbar.make(v, "Preencha todos os campos",Snackbar.LENGTH_SHORT).show();
                }else{

                Intent intent = new Intent(MainActivity.this,perfilhospede.class);
                startActivity(intent);
                finish();

            }}
        });
        bt_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,perfilhospede.class);
                startActivity(intent);
                finish();
            }
        });

    }


    private void IniciarComponentes() {
        edit_email = findViewById(R.id.editTextTextEmailAddress);
        edit_senha = findViewById(R.id.editTextTextPassword);
        bt_entrar = findViewById(R.id.buttonEntrar);
        bt_sem = findViewById(R.id.button);

    }


}


