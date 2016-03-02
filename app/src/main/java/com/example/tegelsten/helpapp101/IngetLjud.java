package com.example.tegelsten.helpapp101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IngetLjud extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inget_ljud);

        TextView textElement = (TextView) findViewById(R.id.textView2);
        textElement.setText("Välj med knapparna ovanför");

        Button knapp1 = (Button) findViewById(R.id.knapp1);
        knapp1.setText(kategorier.knapps1);

        Button knapp2 = (Button) findViewById(R.id.knapp2);
        knapp2.setText(kategorier.knapps2);

        Button knapp3 = (Button) findViewById(R.id.knapp3);
        knapp3.setText(kategorier.knapps3);

        Button knapp4 = (Button) findViewById(R.id.knapp4);
        knapp4.setText(kategorier.knapps4);

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

    TextView textView2;

    public void butt1(View v) {
        textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(kategorier.text1s);

    }

    public void butt2(View v) {
        textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(kategorier.text2s);

    }

    public void butt3(View v) {
        textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(kategorier.text3s);

    }

    public void butt4(View v) {
        textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(kategorier.text4s);

    }

}
