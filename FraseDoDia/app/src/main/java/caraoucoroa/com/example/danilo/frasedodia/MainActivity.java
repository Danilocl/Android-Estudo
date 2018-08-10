package caraoucoroa.com.example.danilo.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textFrase;

    private String[] frases = {"O sucesso normalmente vem para quem está ocupado demais para procurar por ele.",
            "Com grandes poderes vem grandes responsabilidades.","O homem forte que sempre conheceu a força pode perder o valor da força, mas o homem fraco que nunca conheceu a força," +
            "entende o valor da mesma"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.botaoId);
        textFrase = findViewById(R.id.fraseId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int fraseRandom = random.nextInt(frases.length);

                textFrase.setText(frases[fraseRandom]);

            }
        });


    }
}
