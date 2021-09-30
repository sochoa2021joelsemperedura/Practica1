package net.iessochoa.joelsemperedura.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {
    /*
    Sera el valor que enviaremos a la actividad main
    Utilizada para relacionar la etiqueta con el intent que realizara la view
     */
    public static final String EXTRA_NOMBRE="SaludoActivity.NOMBRE";
    TextView tvSaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Obtengo los elementos de la clase R activity_saludo
        setContentView(R.layout.activity_saludo);
        //"Relaciono" el textview de la clase con la view tvSaludo a traves del ID.
        tvSaludo=findViewById(R.id.tvSaludo);
        //Cadena de texto que obtiene el intent a traves del extra que hace referencia a la etiqueta asociada a la accion a realizar
        String saludo=getIntent().getStringExtra(EXTRA_NOMBRE);

        tvSaludo.setText(getString(R.string.Hola)+" "+saludo);
    }
}