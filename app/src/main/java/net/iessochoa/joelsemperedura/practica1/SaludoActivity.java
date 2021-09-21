package net.iessochoa.joelsemperedura.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {
    public static final String EXTRA_NOMBRE="SaludoActivity.NOMBRE";
    TextView tvSaludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        tvSaludo=findViewById(R.id.tvSaludo);
        String saludo=getIntent().getStringExtra(EXTRA_NOMBRE);
    }
}