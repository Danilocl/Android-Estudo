package signos.com.example.danilo.signos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] signos = {"Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem",
            "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"};

    private String[] perfis = {"Características: IMPULSIVIDADE, ESPONTANEIDADE E INGENUIDADE", "CARACTERÍSTICAS DE TOURO :\n" +
            "\n" +
            "REALIZAÇÃO, TEIMOSIA E SENSUALIDADE", "CARACTERÍSTICAS DE GÊMEOS :\n" +
            "\n" +
            "INTELIGÊNCIA, VERSATILIDADE E COMUNICAÇÃO", "CARACTERÍSTICAS DE CÂNCER :\n" +
            "\n" +
            "EMOÇÃO, AFEIÇÃO, IMAGINAÇÃO", "CARACTERÍSTICAS DE LEÃO :\n" +
            "\n" +
            "GENEROSIDADE, NOBREZA E CRIATIVIDADE", "CARACTERÍSTICAS DE VIRGEM :\n" +
            "\n" +
            "PERFECCIONISMO, INTELIGÊNCIA E OPINATIVO", "CARACTERÍSTICAS DE LIBRA :\n" +
            "\n" +
            "VAIDADE, GENTILEZA E IDEALIZAÇÃO", "CARACTERÍSTICAS DE ESCORPIÃO :\n" +
            "\n" +
            "INTENSIDADE, TRANSFORMAÇÃO E MISTÉRIO", "CARACTERÍSTICAS DE SAGITÁRIO :\n" +
            "\n" +
            "ORIGINALIDADE, INTUIÇÃO E INSPIRAÇÃO", "CARACTERÍSTICAS DE CAPRICÓRNIO :\n" +
            "\n" +
            "RESPONSABILIDADE, PERSISTÊNCIA E ESFORÇO", "CARACTERÍSTICAS DE AQUÁRIO :\n" +
            "\n" +
            "INOVAÇÃO, ORIGINALIDADE E VISÃO", "CARACTERÍSTICAS DE PEIXES :\n" +
            "\n" +
            "SOLIDARIEDADE, SENSIBILIDADE E INTUIÇÃO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listId);
        //Seta os valores do listView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );
        //Seta os valores do listView
        listView.setAdapter(adapter);

        //exibi as mensagens de cada signo de acordo com a posição do item do listView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                int posicao = position;
                //Toast.makeText(getApplicationContext(), perfis[posicao], Toast.LENGTH_LONG).show();


                /*
                if (perfis[posicao].equals("Áries")) {
                    startActivity(new Intent(MainActivity.this, ));
                }

                if (perfis[posicao].equals("Touro")) {
                    startActivity(new Intent(MainActivity.this, ));
                }

                if (perfis[posicao].equals("Gêmeos")) {
                    startActivity(new Intent(MainActivity.this, ));
                }

                if (perfis[posicao].equals("Câncer")) {
                    startActivity(new Intent(MainActivity.this, ));
                }

                if (perfis[posicao].equals("Leão")) {
                    startActivity(new Intent(MainActivity.this, ));
                }

                if (perfis[posicao].equals("Virgem")) {
                    startActivity(new Intent(MainActivity.this, ));
                }

                if (perfis[posicao].equals("Libra")) {
                    startActivity(new Intent(MainActivity.this, ));
                }

                if (perfis[posicao].equals("Escorpião")) {
                    startActivity(new Intent(MainActivity.this, ));
                }

                if (perfis[posicao].equals("Sagitário")) {
                    startActivity(new Intent(MainActivity.this, ));
                }

                if (perfis[posicao].equals("Capricórnio")) {
                    startActivity(new Intent(MainActivity.this, ));
                }


                if (perfis[posicao].equals("Peixes")) {
                    startActivity(new Intent(MainActivity.this, ));
                }
                */
                if (signos[posicao].equals("Aquário")) {
                    startActivity(new Intent(MainActivity.this, Aries.class));

                }
            }
        });
    }
}
