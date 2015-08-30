package com.br.ican;

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

import java.util.ArrayList;
import java.util.List;


public class CitiesActivity extends ActionBarActivity {

    private static final String CitiesScreen = "citiesScreen";
    ListView listView;

    @Override
    protected void onCreate(Bundle iclicle) {
        super.onCreate(iclicle);
        setContentView(R.layout.activity_cities);

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
        lista.add(10, "Ontario");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, lista);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(getApplicationContext(), "CLICKED", Toast.LENGTH_SHORT).show();

                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
            }
        });

        /*
        String[] cities = new String[]{
                "Alberta", "British Columbia"
                ,"Ontario", "Manitoba","Quebec"
        };

        this.setListAdapter(new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1, cities));
*/

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cities, menu);
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
