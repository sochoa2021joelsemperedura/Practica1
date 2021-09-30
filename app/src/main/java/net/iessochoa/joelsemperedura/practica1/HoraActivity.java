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
        //Obtengo los elementos de la clase R activity_hora
        setContentView(R.layout.activity_hora);
        //Cadena de texto que obtiene el intent a traves del extra que hace referencia a la etiqueta asociada a la accion a realizar.
        String hora = getIntent().getStringExtra(EXTRA_HORA);
        //String obtenida a traves del archivo XML haciendo referencia a una etiqueta asociada al texto.
        String nombre = getString(R.string.stMiNombre);
        //Relaciono el textview de la clase con la view tvHoraSaludo a traves del ID.
        mensaje=findViewById(R.id.tvHoraSaludo);
        /*
        Recurso obtenido a traves de la clase R que obtiene una cadena de texto asociada a un identificador
         */
        String recurso = getResources().getString(R.string.string_formateada);
        //Dando formato a la String recurso, pasandole el valor de hora y nombre.
        String stringFormateada = String.format(recurso,hora,nombre);

        mensaje.setText(stringFormateada);



    }
}