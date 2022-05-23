package br.edu.ifpe.tads.pdm.facilitatrader;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText CxBanca, CxPayout, CxRetorno;
    private TextView TXResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CxBanca  = findViewById(R.id.CxBanca);
        CxPayout = findViewById(R.id.CxPayout);
        CxRetorno = findViewById(R.id.CxRetorno);
        TXResultado = findViewById(R.id.TxResultado);
    }
    public void Calcular(View view){
        double banca = Double.parseDouble(CxBanca.getText().toString());
        double payout = Double.parseDouble(CxPayout.getText().toString());
        double retorno = Double.parseDouble(CxRetorno.getText().toString());
        double invista = retorno * ((payout * retorno) / 100);

        TXResultado.setText("Invista = " + invista);

    }

}