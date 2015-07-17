package com.br.ican;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.view.View.OnClickListener;
import android.widget.ImageButton;

import static com.br.ican.R.raw.canada_hymn;


public class HymnActivity extends ActionBarActivity implements OnClickListener {

    ImageButton btStart, btStop, btPause;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hymn);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btStart = (ImageButton) findViewById(R.id.btn_play);
        btStop = (ImageButton) findViewById(R.id.btn_stop);
        btPause = (ImageButton)findViewById(R.id.btn_pause);

        player = MediaPlayer.create(this, canada_hymn);
        btStart.setOnClickListener(this);
        btStop.setOnClickListener(this);
        btPause.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v == btStart) {
            player.start();
            btStart.setVisibility(View.INVISIBLE);
            btPause.setVisibility(View.VISIBLE);
        } else if (v == btPause) {
            player.pause();

            btStart.setVisibility(View.VISIBLE);
            btPause.setVisibility(View.INVISIBLE);

        } else if (v == btStop) {
            //mp.stop();
            player.pause();
            player.seekTo(0);
            btStart.setVisibility(View.VISIBLE);
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
