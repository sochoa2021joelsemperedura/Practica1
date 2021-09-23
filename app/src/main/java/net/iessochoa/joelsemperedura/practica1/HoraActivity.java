package net.iessochoa.joelsemperedura.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class HoraActivity extends AppCompatActivity {
    public static final String EXTRA_HORA="HoraActivity.HORA";

    TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);

        String hora = getIntent().getStringExtra(EXTRA_HORA);
        String nombre = getString(R.string.stMiNombre);
        mensaje=findViewById(R.id.tvHoraSaludo);

        String recurso = getResources().getString(R.string.string_formateada);
        String stringFormateada = String.format(recurso,hora,nombre);

        mensaje.setText(stringFormateada);



    }
}