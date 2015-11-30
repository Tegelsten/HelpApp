package com.example.tegelsten.helpapp101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.tegelsten.helpapp101.R;

public class kategorier extends AppCompatActivity {

    public static String textkod;

    public static String knapps1;
    public static String knapps2;
    public static String knapps3;
    public static String knapps4;

    ListView listView;
    Button Problem;
    Button Tips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorier);

        listView = (ListView) findViewById(R.id.list);
        Problem = (Button) findViewById(R.id.Problem);
        Tips = (Button) findViewById(R.id.Tips);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kategorier, menu);
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

    public void buttprobOnclick(View v) {

        // Defined Array values to show in ListView
        String[] values = new String[]{"Inget ljud",
                "Mikrofonen funkar inte",
                "Får bluescreens",
                "Inget internet",
                "Ingen bild",
                "Datorn fryser",
                "Ingenting körs"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                if (itemPosition == 0) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.ingetljud_knapp1);
                    String knapp2 = getResources().getString(R.string.ingetljud_knapp2);
                    String knapp3 = getResources().getString(R.string.ingetljud_knapp3);
                    String knapp4 = getResources().getString(R.string.ingetljud_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_ingetljudtxt);
                    textkod = mess;

                }

                if (itemPosition == 1) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.mikprob_knapp1);
                    String knapp2 = getResources().getString(R.string.mikprob_knapp2);
                    String knapp3 = getResources().getString(R.string.mikprob_knapp3);
                    String knapp4 = getResources().getString(R.string.mikprob_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_miktxt);

                    textkod = mess;

                }

                if (itemPosition == 2) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.ingetljud_knapp1);
                    String knapp2 = getResources().getString(R.string.ingetljud_knapp2);
                    String knapp3 = getResources().getString(R.string.ingetljud_knapp3);
                    String knapp4 = getResources().getString(R.string.ingetljud_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_bluescreen);

                    textkod = mess;

                }

                if (itemPosition == 3) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.ingetljud_knapp1);
                    String knapp2 = getResources().getString(R.string.ingetljud_knapp2);
                    String knapp3 = getResources().getString(R.string.ingetljud_knapp3);
                    String knapp4 = getResources().getString(R.string.ingetljud_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_internet);

                    textkod = mess;

                }

                if (itemPosition == 4) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.ingetljud_knapp1);
                    String knapp2 = getResources().getString(R.string.ingetljud_knapp2);
                    String knapp3 = getResources().getString(R.string.ingetljud_knapp3);
                    String knapp4 = getResources().getString(R.string.ingetljud_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_bild);

                    textkod = mess;

                }

                if (itemPosition == 5) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.ingetljud_knapp1);
                    String knapp2 = getResources().getString(R.string.ingetljud_knapp2);
                    String knapp3 = getResources().getString(R.string.ingetljud_knapp3);
                    String knapp4 = getResources().getString(R.string.ingetljud_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_frys);

                    textkod = mess;

                }

                if (itemPosition == 6) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.ingetljud_knapp1);
                    String knapp2 = getResources().getString(R.string.ingetljud_knapp2);
                    String knapp3 = getResources().getString(R.string.ingetljud_knapp3);
                    String knapp4 = getResources().getString(R.string.ingetljud_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_kors);

                    textkod = mess;

                }


            }

        });

        // Onclick prob slut
    }


    public void buttTipsOnclick(View v) {
        // Defined Array values to show in ListView
        String[] values = new String[]{"Kortkommandon",
                "Webbläsare",
                "Hantera virus",
                "Program",
                "Paint",
                "Programmering",
                "Undvika krasher"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                if (itemPosition == 0) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.ingetljud_knapp1);
                    String knapp2 = getResources().getString(R.string.ingetljud_knapp2);
                    String knapp3 = getResources().getString(R.string.ingetljud_knapp3);
                    String knapp4 = getResources().getString(R.string.ingetljud_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_ingetljudtxt);
                    textkod = mess;

                }

                if (itemPosition == 1) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.mikprob_knapp1);
                    String knapp2 = getResources().getString(R.string.mikprob_knapp2);
                    String knapp3 = getResources().getString(R.string.mikprob_knapp3);
                    String knapp4 = getResources().getString(R.string.mikprob_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_miktxt);

                    textkod = mess;

                }

                if (itemPosition == 2) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.ingetljud_knapp1);
                    String knapp2 = getResources().getString(R.string.ingetljud_knapp2);
                    String knapp3 = getResources().getString(R.string.ingetljud_knapp3);
                    String knapp4 = getResources().getString(R.string.ingetljud_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_bluescreen);

                    textkod = mess;

                }

                if (itemPosition == 3) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.ingetljud_knapp1);
                    String knapp2 = getResources().getString(R.string.ingetljud_knapp2);
                    String knapp3 = getResources().getString(R.string.ingetljud_knapp3);
                    String knapp4 = getResources().getString(R.string.ingetljud_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_internet);

                    textkod = mess;

                }

                if (itemPosition == 4) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.ingetljud_knapp1);
                    String knapp2 = getResources().getString(R.string.ingetljud_knapp2);
                    String knapp3 = getResources().getString(R.string.ingetljud_knapp3);
                    String knapp4 = getResources().getString(R.string.ingetljud_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_bild);

                    textkod = mess;

                }

                if (itemPosition == 5) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.ingetljud_knapp1);
                    String knapp2 = getResources().getString(R.string.ingetljud_knapp2);
                    String knapp3 = getResources().getString(R.string.ingetljud_knapp3);
                    String knapp4 = getResources().getString(R.string.ingetljud_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_frys);

                    textkod = mess;

                }

                if (itemPosition == 6) {

                    startActivity(new Intent(kategorier.this, IngetLjud.class));

                    // När du trycker på knapp byts texten på layouten till det du vill ha

                    String knapp1 = getResources().getString(R.string.ingetljud_knapp1);
                    String knapp2 = getResources().getString(R.string.ingetljud_knapp2);
                    String knapp3 = getResources().getString(R.string.ingetljud_knapp3);
                    String knapp4 = getResources().getString(R.string.ingetljud_knapp4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                    String mess = getResources().getString(R.string.title_text_kors);

                    textkod = mess;

                }


            }

        });

    }
    // Onclick tips slut
}