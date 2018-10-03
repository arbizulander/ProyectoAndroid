package com.example.ik_2dm3.pruebaspoty;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button buttonPlay;
    Button buttonS1;
    Context cont = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlay =(Button) findViewById(R.id.buttonPlay);
        buttonS1 = (Button) findViewById(R.id.buttonS1);



        buttonPlay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            try {
                mp = MediaPlayer.create(cont, R.raw.s2);
                mp.start();
                mp = MediaPlayer.create(cont, R.raw.upvida);
                mp.start();
                mp = MediaPlayer.create(cont, R.raw.s1);
                mp.start();
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
});


        /*buttonS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    mp2.start();
                    //mp.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });*/


    }
    /*private void createAudio(int resource) {
        if (this.mp != null) {
            this.mp.stop();
            this.mp.release();
            this.mp = null;
        }
        return this.mp = MediaPlayer.create(this, resource);
    }*/
}
