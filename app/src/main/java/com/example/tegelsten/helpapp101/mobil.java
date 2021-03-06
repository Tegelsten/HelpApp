package com.example.tegelsten.helpapp101;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class mobil extends AppCompatActivity {

    public static String text1s;
    public static String text2s;
    public static String text3s;
    public static String text4s;

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
        setContentView(R.layout.activity_mobil);

        listView = (ListView) findViewById(R.id.list);
        Problem = (Button) findViewById(R.id.Problem);
        Tips = (Button) findViewById(R.id.Tips);

        Problem.setTextColor(Color.parseColor("#ffffff"));
        Tips.setTextColor(Color.parseColor("#000000"));

        String[] values = new String[]{"Touch fel",
                "PUK eller PIN",
                "Svart skärm",
                "Seg mobil",
                "Kamerafel",
                "Varm mobil",
                "Internet"
        };


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                int itemPosition = position;

                if (itemPosition == 0) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.touch_knapp1);
                    text1s = getResources().getString(R.string.title_text_touch1);

                    String knapp2 = getResources().getString(R.string.touch_knapp2);
                    text2s = getResources().getString(R.string.title_text_touch2);

                    String knapp3 = getResources().getString(R.string.touch_knapp3);
                    text3s = getResources().getString(R.string.title_text_touch3);

                    String knapp4 = getResources().getString(R.string.touch_knapp4);
                    text4s = getResources().getString(R.string.title_text_touch4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                }

                if (itemPosition == 1) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.puk_knapp1);
                    text1s = getResources().getString(R.string.title_text_puk1);

                    String knapp2 = getResources().getString(R.string.puk_knapp2);
                    text2s = getResources().getString(R.string.title_text_puk2);

                    String knapp3 = getResources().getString(R.string.puk_knapp3);
                    text3s = getResources().getString(R.string.title_text_puk3);

                    String knapp4 = getResources().getString(R.string.puk_knapp4);
                    text4s = getResources().getString(R.string.title_text_puk4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 2) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.svartskarm_knapp1);
                    text1s = getResources().getString(R.string.title_text_svartskarm1);

                    String knapp2 = getResources().getString(R.string.svartskarm_knapp2);
                    text2s = getResources().getString(R.string.title_text_svartskarm2);

                    String knapp3 = getResources().getString(R.string.svartskarm_knapp3);
                    text3s = getResources().getString(R.string.title_text_svartskarm3);

                    String knapp4 = getResources().getString(R.string.svartskarm_knapp4);
                    text4s = getResources().getString(R.string.title_text_svartskarm4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 3) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.segmobil_knapp1);
                    text1s = getResources().getString(R.string.title_text_segskarm1);

                    String knapp2 = getResources().getString(R.string.segmobil_knapp2);
                    text2s = getResources().getString(R.string.title_text_segskarm2);

                    String knapp3 = getResources().getString(R.string.segmobil_knapp3);
                    text3s = getResources().getString(R.string.title_text_segskarm3);

                    String knapp4 = getResources().getString(R.string.segmobil_knapp4);
                    text4s = getResources().getString(R.string.title_text_segskarm4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 4) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.kamfel_knapp1);
                    text1s = getResources().getString(R.string.title_text_kamfel1);

                    String knapp2 = getResources().getString(R.string.kamfel_knapp2);
                    text2s = getResources().getString(R.string.title_text_kamfel2);

                    String knapp3 = getResources().getString(R.string.kamfel_knapp3);
                    text3s = getResources().getString(R.string.title_text_kamfel3);

                    String knapp4 = getResources().getString(R.string.kamfel_knapp4);
                    text4s = getResources().getString(R.string.title_text_kamfel4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 5) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.varmmobil_knapp1);
                    text1s = getResources().getString(R.string.title_text_varmobil1);

                    String knapp2 = getResources().getString(R.string.varmmobil_knapp2);
                    text2s = getResources().getString(R.string.title_text_varmobil2);

                    String knapp3 = getResources().getString(R.string.varmmobil_knapp3);
                    text3s = getResources().getString(R.string.title_text_varmobil3);

                    String knapp4 = getResources().getString(R.string.varmmobil_knapp4);
                    text4s = getResources().getString(R.string.title_text_varmobil4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 6) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.internet_knapp1);
                    text1s = getResources().getString(R.string.title_text_tippinternet1);

                    String knapp2 = getResources().getString(R.string.internet_knapp2);
                    text2s = getResources().getString(R.string.title_text_tippinternet2);

                    String knapp3 = getResources().getString(R.string.internet_knapp3);
                    text3s = getResources().getString(R.string.title_text_tippinternet3);

                    String knapp4 = getResources().getString(R.string.internet_knapp4);
                    text4s = getResources().getString(R.string.title_text_tippinternet4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }


            }

        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mobil, menu);
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

        String[] values = new String[]{"Touch fel",
                "PUK eller PIN",
                "Svart skärm",
                "Seg mobil",
                "Kamerafel",
                "Varm mobil",
                "Internet"
        };

        Problem.setTextColor(Color.parseColor("#ffffff"));
        Tips.setTextColor(Color.parseColor("#000000"));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                int itemPosition = position;

                if (itemPosition == 0) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.touch_knapp1);
                    text1s = getResources().getString(R.string.title_text_touch1);

                    String knapp2 = getResources().getString(R.string.touch_knapp2);
                    text2s = getResources().getString(R.string.title_text_touch2);

                    String knapp3 = getResources().getString(R.string.touch_knapp3);
                    text3s = getResources().getString(R.string.title_text_touch3);

                    String knapp4 = getResources().getString(R.string.touch_knapp4);
                    text4s = getResources().getString(R.string.title_text_touch4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;

                }

                if (itemPosition == 1) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.puk_knapp1);
                    text1s = getResources().getString(R.string.title_text_puk1);

                    String knapp2 = getResources().getString(R.string.puk_knapp2);
                    text2s = getResources().getString(R.string.title_text_puk2);

                    String knapp3 = getResources().getString(R.string.puk_knapp3);
                    text3s = getResources().getString(R.string.title_text_puk3);

                    String knapp4 = getResources().getString(R.string.puk_knapp4);
                    text4s = getResources().getString(R.string.title_text_puk4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 2) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.svartskarm_knapp1);
                    text1s = getResources().getString(R.string.title_text_svartskarm1);

                    String knapp2 = getResources().getString(R.string.svartskarm_knapp2);
                    text2s = getResources().getString(R.string.title_text_svartskarm2);

                    String knapp3 = getResources().getString(R.string.svartskarm_knapp3);
                    text3s = getResources().getString(R.string.title_text_svartskarm3);

                    String knapp4 = getResources().getString(R.string.svartskarm_knapp4);
                    text4s = getResources().getString(R.string.title_text_svartskarm4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 3) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.segmobil_knapp1);
                    text1s = getResources().getString(R.string.title_text_segskarm1);

                    String knapp2 = getResources().getString(R.string.segmobil_knapp2);
                    text2s = getResources().getString(R.string.title_text_segskarm2);

                    String knapp3 = getResources().getString(R.string.segmobil_knapp3);
                    text3s = getResources().getString(R.string.title_text_segskarm3);

                    String knapp4 = getResources().getString(R.string.segmobil_knapp4);
                    text4s = getResources().getString(R.string.title_text_segskarm4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 4) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.kamfel_knapp1);
                    text1s = getResources().getString(R.string.title_text_kamfel1);

                    String knapp2 = getResources().getString(R.string.kamfel_knapp2);
                    text2s = getResources().getString(R.string.title_text_kamfel2);

                    String knapp3 = getResources().getString(R.string.kamfel_knapp3);
                    text3s = getResources().getString(R.string.title_text_kamfel3);

                    String knapp4 = getResources().getString(R.string.kamfel_knapp4);
                    text4s = getResources().getString(R.string.title_text_kamfel4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 5) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.varmmobil_knapp1);
                    text1s = getResources().getString(R.string.title_text_varmobil1);

                    String knapp2 = getResources().getString(R.string.varmmobil_knapp2);
                    text2s = getResources().getString(R.string.title_text_varmobil2);

                    String knapp3 = getResources().getString(R.string.varmmobil_knapp3);
                    text3s = getResources().getString(R.string.title_text_varmobil3);

                    String knapp4 = getResources().getString(R.string.varmmobil_knapp4);
                    text4s = getResources().getString(R.string.title_text_varmobil4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 6) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.internet_knapp1);
                    text1s = getResources().getString(R.string.title_text_tippinternet1);

                    String knapp2 = getResources().getString(R.string.internet_knapp2);
                    text2s = getResources().getString(R.string.title_text_tippinternet2);

                    String knapp3 = getResources().getString(R.string.internet_knapp3);
                    text3s = getResources().getString(R.string.title_text_tippinternet3);

                    String knapp4 = getResources().getString(R.string.internet_knapp4);
                    text4s = getResources().getString(R.string.title_text_tippinternet4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }


            }

        });

    }


    public void buttTipsOnclick(View v) {

        String[] values = new String[]{"Appar",
                "Spara batteri",
                "Designa startsidan",
                "Säkerhet",
                "Mobil webbläsare",
                "Genvägar",
                "Övrigt"
        };

        Tips.setTextColor(Color.parseColor("#ffffff"));
        Problem.setTextColor(Color.parseColor("#000000"));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                int itemPosition = position;

                if (itemPosition == 0) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.appar_knapp1);
                    text1s = getResources().getString(R.string.title_text_appar1);

                    String knapp2 = getResources().getString(R.string.appar_knapp2);
                    text2s = getResources().getString(R.string.title_text_appar2);

                    String knapp3 = getResources().getString(R.string.appar_knapp3);
                    text3s = getResources().getString(R.string.title_text_appar3);

                    String knapp4 = getResources().getString(R.string.appar_knapp4);
                    text4s = getResources().getString(R.string.title_text_appar4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;



                }

                if (itemPosition == 1) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.batteri_knapp1);
                    text1s = getResources().getString(R.string.title_text_batteri1);

                    String knapp2 = getResources().getString(R.string.batteri_knapp2);
                    text2s = getResources().getString(R.string.title_text_batteri2);

                    String knapp3 = getResources().getString(R.string.batteri_knapp3);
                    text3s = getResources().getString(R.string.title_text_batteri3);

                    String knapp4 = getResources().getString(R.string.batteri_knapp4);
                    text4s = getResources().getString(R.string.title_text_batteri4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 2) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.designastart_knapp1);
                    text1s = getResources().getString(R.string.title_text_designstart1);

                    String knapp2 = getResources().getString(R.string.designastart_knapp2);
                    text2s = getResources().getString(R.string.title_text_designstart2);

                    String knapp3 = getResources().getString(R.string.designastart_knapp3);
                    text3s = getResources().getString(R.string.title_text_designstart3);

                    String knapp4 = getResources().getString(R.string.designastart_knapp4);
                    text4s = getResources().getString(R.string.title_text_designstart4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 3) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.sakerhet_knapp1);
                    text1s = getResources().getString(R.string.title_text_sakerhet1);

                    String knapp2 = getResources().getString(R.string.sakerhet_knapp2);
                    text2s = getResources().getString(R.string.title_text_sakerhet2);

                    String knapp3 = getResources().getString(R.string.sakerhet_knapp3);
                    text3s = getResources().getString(R.string.title_text_sakerhet3);

                    String knapp4 = getResources().getString(R.string.sakerhet_knapp4);
                    text4s = getResources().getString(R.string.title_text_sakerhet4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 4) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.mobilwebb_knapp1);
                    text4s = getResources().getString(R.string.title_text_mobilwebb1);

                    String knapp2 = getResources().getString(R.string.mobilwebb_knapp2);
                    text4s = getResources().getString(R.string.title_text_mobilwebb2);

                    String knapp3 = getResources().getString(R.string.mobilwebb_knapp3);
                    text4s = getResources().getString(R.string.title_text_mobilwebb3);

                    String knapp4 = getResources().getString(R.string.mobilwebb_knapp4);
                    text4s = getResources().getString(R.string.title_text_mobilwebb4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 5) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.genvagar_knapp1);
                    text1s = getResources().getString(R.string.title_text_genvag1);

                    String knapp2 = getResources().getString(R.string.genvagar_knapp2);
                    text2s = getResources().getString(R.string.title_text_genvag2);

                    String knapp3 = getResources().getString(R.string.genvagar_knapp3);
                    text3s = getResources().getString(R.string.title_text_genvag3);

                    String knapp4 = getResources().getString(R.string.genvagar_knapp4);
                    text4s = getResources().getString(R.string.title_text_genvag4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }

                if (itemPosition == 6) {

                    startActivity(new Intent(mobil.this, MobilNasta.class));

                    String knapp1 = getResources().getString(R.string.ovrigt_knapp1);
                    text1s = getResources().getString(R.string.title_text_ovrigt1);

                    String knapp2 = getResources().getString(R.string.ovrigt_knapp2);
                    text2s = getResources().getString(R.string.title_text_ovrigt2);

                    String knapp3 = getResources().getString(R.string.ovrigt_knapp3);
                    text3s = getResources().getString(R.string.title_text_ovrigt3);

                    String knapp4 = getResources().getString(R.string.ovrigt_knapp4);
                    text4s = getResources().getString(R.string.title_text_ovrigt4);

                    knapps1 = knapp1;
                    knapps2 = knapp2;
                    knapps3 = knapp3;
                    knapps4 = knapp4;


                }


            }

        });

    }


}




