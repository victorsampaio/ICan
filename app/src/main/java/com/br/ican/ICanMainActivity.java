package com.br.ican;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.br.ican.images.ImagesActivity;


public class ICanMainActivity extends ActionBarActivity {

    // Variable
    // Variaveis que serão utilizadas - Botões que contem Imagem
    ImageButton btGoHymn, btGoImages, btGoCities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ican_main);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btGoHymn = (ImageButton) findViewById(R.id.imgbGoHymn);
        btGoHymn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itHymn = new Intent(getApplicationContext(), HymnActivity.class);
                startActivity(itHymn);

            }
        });

        btGoImages = (ImageButton) findViewById(R.id.imgbGoImages);
        btGoImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itImages = new Intent(getApplicationContext(), ImagesActivity.class);
                startActivity(itImages);

            }
        });

        btGoCities = (ImageButton) findViewById(R.id.imgbGoCities);
        btGoCities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itCities = new Intent(getApplicationContext(), CitiesActivity.class);
                startActivity(itCities);

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ican_main, menu);
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
