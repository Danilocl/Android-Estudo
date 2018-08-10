package geolocalizacao.com.example.danilo.geolocalizacao;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private TextView longui;
    private TextView lat;
    private int teste = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        botao = findViewById(R.id.botaoId);
        longui = findViewById(R.id.longId);
        lat = findViewById(R.id.latId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pedirPermissoes();
            }
        });

    }

    //Checa se o usuário tem permissão usar o gps
    public void pedirPermissoes() {
        Toast.makeText(this, "Entrou no método", Toast.LENGTH_LONG).show();

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            //requisita a permissão
            Toast.makeText(this, "Entrou no if", Toast.LENGTH_LONG).show();
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
        } else {
            Toast.makeText(this, "Entrou no else", Toast.LENGTH_LONG).show();
            configurarServico();
        }
    }

    public void configurarServico() {
        try {


            Toast.makeText(this, "Entrou no configuraServico()", Toast.LENGTH_LONG).show();

            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

            LocationListener locationListener = new LocationListener() {

                @Override
                public void onLocationChanged(Location location) {
                    teste += 1;
                    atualizar(location);
                }

                @Override
                public void onStatusChanged(String s, int i, Bundle bundle) {
                    teste = 2;
                }

                @Override
                public void onProviderEnabled(String s) {
                    teste = 3;
                }

                @Override
                public void onProviderDisabled(String s) {
                    teste = 4;
                }
            };


            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
        } catch (SecurityException ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_LONG).show();
        }
        Toast.makeText(this, "Entrou no onLocationListener() " + teste, Toast.LENGTH_LONG).show();
    }

    public void atualizar(Location location) {
        Double ltPoint = location.getLatitude();
        Double lgPoint = location.getLongitude();

        longui.setText(lgPoint.toString());
        lat.setText(ltPoint.toString());
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case 1: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    configurarServico();
                } else {
                    Toast.makeText(this, "Não vai funcionar", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}
