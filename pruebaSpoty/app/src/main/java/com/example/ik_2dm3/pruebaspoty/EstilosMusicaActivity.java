package com.example.ik_2dm3.pruebaspoty;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EstilosMusicaActivity extends AppCompatActivity {


    private ImageButton btn1, btn2, btn3, btn4;
    private String btntext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estilos_musica);

        btn1 = findViewById(R.id.img1);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img1);
        btn1.setImageBitmap(bmp);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent i = new Intent(getBaseContext(), ListadoCancionesActivity.class);
                    btntext = "btnpulado_1";
                    i.putExtra("parametro",btntext);
                    startActivity(i);
                    //mp.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btn2 = findViewById(R.id.img2);
        bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img2);
        btn2.setImageBitmap(bmp);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent i = new Intent(getBaseContext(), ListadoCancionesActivity.class);
                    btntext = "btnpulado_2";
                    i.putExtra("parametro",btntext);
                    startActivity(i);
                    //mp.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btn2 = findViewById(R.id.img3);
        bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img1);
        btn2.setImageBitmap(bmp);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent i = new Intent(getBaseContext(), ListadoCancionesActivity.class);
                    btntext = "btnpulado_3";
                    i.putExtra("parametro",btntext);
                    startActivity(i);
                    //mp.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btn2 = findViewById(R.id.img4);
        bmp = BitmapFactory.decodeResource(getResources(), R.drawable.img2);
        btn2.setImageBitmap(bmp);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent i = new Intent(getBaseContext(), ListadoCancionesActivity.class);
                    btntext = "btnpulado_4";
                    i.putExtra("parametro",btntext);
                    startActivity(i);
                    //mp.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }
}
