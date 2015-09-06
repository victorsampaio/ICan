package com.br.ican;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.br.ican.provinces.alberta.AlbertaActivity;
import com.br.ican.provinces.britishcolumbia.BritishColumbiaActivity;
import com.br.ican.provinces.manitoba.ManitobaActivity;
import com.br.ican.provinces.newbrunswick.NewBrunswickActivity;
import com.br.ican.provinces.newfoundlandandlabrador.NewfoundlandandLabradorActivity;
import com.br.ican.provinces.novascotia.NovaScotiaActivity;
import com.br.ican.provinces.ontario.OntarioActivity;
import com.br.ican.provinces.princeedwardisland.PrinceEdwardIslandActivity;
import com.br.ican.provinces.quebec.QuebecActivity;
import com.br.ican.provinces.saskatchewan.SaskatchewanActivity;

import java.util.ArrayList;
import java.util.List;

public class ProvincesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provinces);

        String CitiesScreen = "citiesScreen";
        ListView listView;


        List<String> lista = new ArrayList<>();
        lista.add(0, "Alberta");
        lista.add(1, "British Columbia");
        lista.add(2, "Manitoba");
        lista.add(3, "New Brunswick");
        lista.add(4, "Newfoundland and Labrador");
        lista.add(5, "Nova Scotia");
        lista.add(6, "Ontario");
        lista.add(7, "Prince Edward Island");
        lista.add(8, "Quebec");
        lista.add(9, "Saskatchewan");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, lista);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(getApplicationContext(), "CLICKED", Toast.LENGTH_SHORT).show();


                switch (position) {

                    case 0:
                        Toast.makeText(getApplicationContext(),
                                ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                        Intent it0 = new Intent(getApplicationContext(), AlbertaActivity.class);
                        startActivity(it0);
                        break;

                    case 1:
                        Toast.makeText(getApplicationContext(),
                                ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                        Intent it1 = new Intent(getApplicationContext(), BritishColumbiaActivity.class);
                        startActivity(it1);
                        break;


                    case 2:
                        Toast.makeText(getApplicationContext(),
                                ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                        Intent it2 = new Intent(getApplicationContext(), ManitobaActivity.class);
                        startActivity(it2);

                        break;

                    case 3:
                        Toast.makeText(getApplicationContext(),
                                ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                        Intent it3 = new Intent(getApplicationContext(), NewBrunswickActivity.class);
                        startActivity(it3);
                        break;
                    case 4:
                        Toast.makeText(getApplicationContext(),
                                ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                        Intent it4 = new Intent(getApplicationContext(), NewfoundlandandLabradorActivity.class);
                        startActivity(it4);
                        break;

                    case 5:
                        Toast.makeText(getApplicationContext(),
                                ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                        Intent it5 = new Intent(getApplicationContext(), NovaScotiaActivity.class);
                        startActivity(it5);
                        break;
                    case 6:
                        Toast.makeText(getApplicationContext(),
                                ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                        Intent it6 = new Intent(getApplicationContext(), OntarioActivity.class);
                        startActivity(it6);
                        break;

                    case 7:
                        Toast.makeText(getApplicationContext(),
                                ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                        Intent it7 = new Intent(getApplicationContext(), PrinceEdwardIslandActivity.class);
                        startActivity(it7);
                        break;
                    case 8:
                        Toast.makeText(getApplicationContext(),
                                ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                        Intent it8 = new Intent(getApplicationContext(), QuebecActivity.class);
                        startActivity(it8);
                        break;

                    case 9:
                        Toast.makeText(getApplicationContext(),
                                ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                        Intent it9 = new Intent(getApplicationContext(), SaskatchewanActivity.class);
                        startActivity(it9);
                        break;

                    default:

                }


            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_provinces, menu);
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
