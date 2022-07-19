package com.example.practica_clase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.practica_clase.databinding.ActivityAceptadoBinding;

public class Aceptado extends AppCompatActivity {
    public static final String USUARIO_KEY="usuario";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAceptadoBinding binding = ActivityAceptadoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TextView txt_valoracion = findViewById(R.id.txt_valorclave);
        String resul="";
        float valoracion=MainActivity.valoracion;

        Bundle extras = getIntent().getExtras();
        Usuario sitio = extras.getParcelable(USUARIO_KEY);
        binding.setUsuario(sitio);

        if(valoracion==1){
            resul= "La clave de seguridad se considera Insegura";
            txt_valoracion.setText(resul);
        }else if(valoracion==2){
            resul= "La clave de seguridad se considera Baja";
            txt_valoracion.setText(resul);
        }else if(valoracion==3){
            resul= "La clave de seguridad se considera Media";
            txt_valoracion.setText(resul);
        }else if(valoracion==4){
            resul= "La clave de seguridad se considera Media Alta";
            txt_valoracion.setText(resul);
        }else{
            resul= "La clave de seguridad se considera Alta";
            txt_valoracion .setText(resul);
        }

    }
}