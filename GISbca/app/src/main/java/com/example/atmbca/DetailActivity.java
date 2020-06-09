package com.example.atmbca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.net.URI;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    TextView datanama, dataalamat, datacall_center;
    Button btncallcenter;
    ImageView datagambar;
    public static String id, nama, alamat, call_center, gambar;
    public static Double latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama= findViewById(R.id.tv_nama);
        dataalamat = findViewById(R.id.tv_alamat);
        datacall_center = findViewById(R.id.tv_call_center);
        datagambar = findViewById(R.id.image_atm);
        btncallcenter = findViewById(R.id.btncall_center);

        datanama.setText(nama);
        dataalamat.setText(alamat);
        datacall_center.setText(call_center);
        Picasso.get().load(gambar).into(datagambar);

        btncallcenter.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+call_center));
        startActivity(call);

    }
}
