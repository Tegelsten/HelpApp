package com.example.tegelsten.helpapp101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.tegelsten.helpapp101.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void kategorier(View view) {
        Intent startNewActivity = new Intent(this,kategorier.class);

        startActivity(startNewActivity);

    }
    public void datorkomponenter(View view) {
        Intent startNewActivity = new Intent(this,datorkomponenter.class);

        startActivity(startNewActivity);

    }

    public void mobil(View view) {
        Intent startNewActivity = new Intent(this, mobil.class);

        startActivity(startNewActivity);

    }
    public void videos(View view) {
        Intent startNewActivity = new Intent(this,videos.class);

        startActivity(startNewActivity);

    }
}
