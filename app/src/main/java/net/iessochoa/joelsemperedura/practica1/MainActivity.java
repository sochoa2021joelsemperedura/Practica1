package net.iessochoa.joelsemperedura.practica1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.LocaleData;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainActivity extends AppCompatActivity {
    EditText etNombre;
    Button btnOk;
    Button btnHora;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //obteniendo los elementos de la clase R
        iniciaViews();

        /**
         * Lambda que crea un intent que comunica la MainActivity con SaludoActivity y le pasa el texto introducido por el usuario al hacer clic en el boton con la etiqueta btnOk
         */
        btnOk.setOnClickListener(v -> {
            Intent intent= new Intent(MainActivity.this,SaludoActivity.class);
            intent.putExtra(SaludoActivity.EXTRA_NOMBRE,etNombre.getText().toString());
            //Inicia la actividad intent
            startActivity(intent);
        });
        /**
         * Lambda que crea un intent que comunica la MainActivity con HoraActivity y le pasa el metodo enviaHora al hacer clic.
         */
        btnHora.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HoraActivity.class);
            intent.putExtra(HoraActivity.EXTRA_HORA,enviaHora());
            //Inicia intent
            startActivity(intent);
        });

    }

    /**
     * Metodo que relaciona los atributos de la clase con sus views correspondientes, de esta forma puedo trabajar con ellas.
     */
    private void iniciaViews() {
        etNombre=findViewById(R.id.etNombre);
        btnOk=findViewById(R.id.btnOk);
        btnHora=findViewById(R.id.btnHora);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    /**
     * Metodo que nos devuelve la hora actual en forma de String
     */
    private String enviaHora() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
        String hora=df.format(LocalDateTime.now());
        return hora;
    }

}