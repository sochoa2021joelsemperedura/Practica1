package net.iessochoa.joelsemperedura.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNombre;
    Button btnOk;
    Button btnHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //obteniendo los elementos de la clase R
        iniciaViews();


        btnOk.setOnClickListener(v -> {
            Intent intent= new Intent(MainActivity.this,SaludoActivity.class);
            intent.putExtra(SaludoActivity.EXTRA_NOMBRE,etNombre.getText().toString());

            startActivity(intent);
        });

        btnHora.setOnClickListener(v -> enviaHora());

    }

    private void iniciaViews() {
        etNombre=findViewById(R.id.etNombre);
        btnOk=findViewById(R.id.btnOk);
        btnHora=findViewById(R.id.btnHora);
    }

    private void enviaHora() {
        //RELLENAR
    }

}