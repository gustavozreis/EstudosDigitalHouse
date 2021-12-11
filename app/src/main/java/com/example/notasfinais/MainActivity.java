package com.example.notasfinais;

import androidx.appcompat.app.AppCompatActivity;
import com.example.notasfinais.Utils;


import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(botaoApertado);


    }

    public void mostrarMedia(){
        EditText eTPrimeiroB = (EditText) findViewById(R.id.eTPrimeiroB);
        EditText eTSegundoB = (EditText) findViewById(R.id.eTSegundoB);
        EditText eTTerceiroB = (EditText) findViewById(R.id.eTTerceiroB);
        EditText eTQuartoB = (EditText) findViewById(R.id.eTQuartoB);

        TextView tVResultado = (TextView) findViewById(R.id.tVResultado);

        Utils utils = new Utils();
        float mediaFinal = utils.calcularNotas(eTPrimeiroB, eTSegundoB, eTTerceiroB, eTQuartoB);
        tVResultado.setText("A MÉDIA FINAL É " + mediaFinal);

    }

    public View.OnClickListener botaoApertado = new View.OnClickListener() {
        public void onClick(View v) {
            mostrarMedia();
        }
    };

}