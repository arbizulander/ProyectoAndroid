package com.example.ik_2dm3.pruebaspoty;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Environment;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListadoCancionesActivity extends AppCompatActivity {

    String arraybtn1[] = {"s1", "upvida", "s2"};
    int arrayValor[] = {R.raw.s1, R.raw.upvida, R.raw.s2 };
    int item = 0;
    Button btn_play;


    MediaPlayer mp;
    Context cont = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_canciones);

        btn_play = (Button) findViewById(R.id.btn_play);
        //String dato = getIntent().getStringExtra("parametro");
        //TextView text = (TextView) findViewById(R.id.idText);
        final ListView milista = (ListView) findViewById(R.id.milista);

        //text.setText(dato);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arraybtn1);
        milista.setAdapter(adapter);

        milista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                item = position;
                String itemval = (String) milista.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Position: " + item + " - Valor: " + itemval, Toast.LENGTH_LONG).show();

                mp = MediaPlayer.create(cont, arrayValor[item]);
                mp.start();
            }

        });


        //mp = MediaPlayer.create(cont, arrayValor[item]);

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    for (int i = 0;i<3;i++){
                        mp = MediaPlayer.create(cont, arrayValor[i]);
                        if(mp == null) {
                            Toast.makeText(ListadoCancionesActivity.this, "I'm Finished", Toast.LENGTH_SHORT).show();
                        } else {
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                                @Override
                                public void onCompletion(MediaPlayer mediaplayer) {
                                    mediaplayer.stop();
                                    mediaplayer.release();
                                }
                            });
                            mp.start();

                        }
                    }




                   /* mp.start();       //Next line is the beginning of where to place the code.
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            mp.release();
                            Toast.makeText(ListadoCancionesActivity.this, "I'm Finished", Toast.LENGTH_SHORT).show();
                        }

                    });
                    item = item + 1;
                    mp = MediaPlayer.create(cont, arrayValor[item]);
                    if (mp != null){
                        mp.prepare();
                        mp.start();
                    }*/

                }
                catch (Exception e){
                    Log.e("carcast", "Recording.play", e);
                }
            }
        });


        /*mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                item = item+1;
                mp = MediaPlayer.create(cont, arrayValor[item]);// finish current activity
                mp.start();
            }
        });*/


        /*switch (dato){
            case ("btnpulsado_1"):
                //crear listado de canciones


                //mp = MediaPlayer.create(cont, arrayValor[item]);
                break;
        }*/

    }
}




