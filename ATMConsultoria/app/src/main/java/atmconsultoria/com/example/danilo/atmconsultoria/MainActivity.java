package atmconsultoria.com.example.danilo.atmconsultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView clientes;
    private ImageView contato;
    private ImageView empresa;
    private ImageView servicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clientes = findViewById(R.id.clientesId);
        contato = findViewById(R.id.contatoId);
        empresa = findViewById(R.id.empresaId);
        servicos = findViewById(R.id.servicosId);

        clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, Clientes.class));
            }
        });

        contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Contato.class));

            }
        });

        empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(MainActivity.this,Empresas.class));
            }
        });

        servicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(MainActivity.this,Servicos.class));
            }
        });
    }
}
