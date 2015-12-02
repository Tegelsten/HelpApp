package com.example.tegelsten.helpapp101;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MobilNasta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobilnasta);

        TextView textElement = (TextView) findViewById(R.id.textView2);
        textElement.setText(mobil.textkod);

        Button knapp1 = (Button) findViewById(R.id.knapp1);
        knapp1.setText(mobil.knapps1);

        Button knapp2 = (Button) findViewById(R.id.knapp2);
        knapp2.setText(mobil.knapps2);

        Button knapp3 = (Button) findViewById(R.id.knapp3);
        knapp3.setText(mobil.knapps3);

        Button knapp4 = (Button) findViewById(R.id.knapp4);
        knapp4.setText(mobil.knapps4);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inget_ljud, menu);
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
