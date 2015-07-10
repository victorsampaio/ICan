package com.br.ican;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.br.ican.images.ImagesActivity;


public class ICanMainActivity extends ActionBarActivity {

    // Variable
    // Variaveis que serão utilizadas - Botões que contem Imagem
    ImageButton btGoHymn, btGoImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ican_main);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        //Go Hymn
        // Variavel efetuando referencia ao arquivo xml por id
        btGoHymn = (ImageButton)findViewById(R.id.imgbGoHymn);
        // Variavel atribuindo a funcao de click ao metodo que executa a ação de click
        btGoHymn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent for action to new screen - Activity
                Intent itHymn = new Intent(getApplicationContext(), HymnActivity.class);
                startActivity(itHymn);
            }
        });

        //---IMAGES
        btGoImages =(ImageButton)findViewById(R.id.imgbGobImages);
        btGoImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itImg = new Intent(getApplicationContext(), ImagesActivity.class);
                startActivity(itImg);
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
