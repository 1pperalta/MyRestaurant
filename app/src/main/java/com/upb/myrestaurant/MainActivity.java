package com.upb.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirMenu(View v) {

        Intent i;
        i = new Intent(this, MenuActivity.class);
        startActivity(i);
    }

    public void abrirSedes(View v) {

        Intent i;
        i = new Intent(this, MapsActivity2.class);
        startActivity(i);
    }


    public void abrirReserva(View v) {
        String numero = "+573022932552";
        String mensaje = "Hola, estoy interesado en hacer una reserva."; // Mensaje que quieres enviar
        String url = "https://api.whatsapp.com/send?phone=" + numero + "&text=" + Uri.encode(mensaje);
        String whatsapp = "com.whatsapp";
        PackageManager pm = getPackageManager();

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        i.setPackage(whatsapp);

        if (i.resolveActivity(pm) != null) {
            startActivity(i);
        }
    }

    public void abrirPedido(View v) {
        String numero = "+573022932552";
        String mensaje = "Hola, estoy interesado en hacer un pedido."; // Mensaje que quieres enviar
        String url = "https://api.whatsapp.com/send?phone=" + numero + "&text=" + Uri.encode(mensaje);
        String whatsapp = "com.whatsapp";
        PackageManager pm = getPackageManager();

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        i.setPackage(whatsapp);

        if (i.resolveActivity(pm) != null) {
            startActivity(i);
        }
    }
}