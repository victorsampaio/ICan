package com.br.ican;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.view.View.OnClickListener;
import android.widget.ImageButton;

import static com.br.ican.R.raw.canada_hymn;


public class HymnActivity extends ActionBarActivity implements OnClickListener {

    ImageButton btStart, btStop;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hymn);

        btStart = (ImageButton)findViewById(R.id.btn_play);
        btStop = (ImageButton)findViewById(R.id.btn_stop);
        //player = MediaPlayer.create(this, canada_hymn);

        btStart.setOnClickListener(this);
        btStop.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        try {

            if (v == btStart){
                if (player == MediaPlayer.create(this, canada_hymn)){
                player.stop();
                }else {
                    player = new MediaPlayer();
                    player = MediaPlayer.create(this, canada_hymn);
                    player.start();
                }
            }else if (v == btStop){
                //player.isPlaying();
                player.stop();
            }

        }catch (Exception e){

        }

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hymn, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
