package dev.hardsoft.onroad20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Inicio_sesion extends AppCompatActivity {
    EditText TXT_USR,TXT_PASS;
    Button BTN_ING;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        TXT_USR = (EditText) findViewById(R.id.correo1);
        TXT_PASS = (EditText) findViewById(R.id.password1);
        BTN_ING = (Button) findViewById(R.id.btn1);
        BTN_ING.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String V_USR = TXT_USR.getText().toString();
                String V_PASS = TXT_PASS.getText().toString();
                String correo = "steven.josspa@gmail.com";
                String password = "holamundo123";
                if(V_USR.equals(correo) && V_PASS.equals(password)){
                    Intent i = new Intent(getApplicationContext(),MenuActivity.class);
                    startActivity(i);
                    finish();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Usuario o Contraseña incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}