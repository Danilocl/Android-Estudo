package com.example.danilo.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText alcol;
    private EditText gasolina;
    private TextView result;
    private Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alcol = findViewById(R.id.alcoolText);
        gasolina = findViewById(R.id.gasolinaText);
        result = findViewById(R.id.resultId);
        button = findViewById(R.id.butaoID);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //CAPTURA OS VALORES
                String precoAlcol = alcol.getText().toString();
                String precoGasolina = gasolina.getText().toString();

                //converte para double
                double alcoNumer = Double.parseDouble(precoAlcol);
                double gasoNumber = Double.parseDouble(precoGasolina);
                String texto1 = "É recomensável que você utilize a gasolina";
                String texto2 = "É recomendável que você utilize o álcool";


                //Álcool / Gasolina

                double resultado = alcoNumer / gasoNumber;

                if (resultado >= 0.7) {
                    Toast.makeText(MainActivity.this,texto1,Toast.LENGTH_LONG).show();
                    result.setText("É recomensável que você utilize a gasolina");
                } else {
                    Toast.makeText(MainActivity.this,texto2,Toast.LENGTH_LONG).show();
                    result.setText("É recomensável que você utilize o álcool");
                }


            }
        });

    }
}
