package com.example.ik_2dm3.pruebaspoty;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListadoCancionesActivity extends AppCompatActivity {

    String arraybtn1[] = {"s1", "s2",  "upvida"};
    int arrayValor [] = { R.raw.s1, R.raw.s2, R.raw.upvida};

    MediaPlayer mp;
    Context cont = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_canciones);

        String dato = getIntent().getStringExtra("parametro");
        //TextView text = (TextView) findViewById(R.id.idText);
        final ListView milista = (ListView)findViewById(R.id.milista);

        //text.setText(dato);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arraybtn1);
        milista.setAdapter(adapter);

        milista.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                int item = position;
                String itemval = (String)milista.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Position: "+ item+" - Valor: "+itemval, Toast.LENGTH_LONG).show();

                mp = MediaPlayer.create(cont, arrayValor[item]);
                mp.start();
            }

        });

        /*switch (dato){
            case ("btnpulsado_1"):
                //crear listado de canciones


                //mp = MediaPlayer.create(cont, arrayValor[item]);
                break;
        }*/

    }
}
