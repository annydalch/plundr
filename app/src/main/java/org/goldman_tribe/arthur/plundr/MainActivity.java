package org.goldman_tribe.arthur.plundr;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public final static String COUNTRY_NAME = "org.goldman_tribe.arthur.plundr.COUNTRY_NAME";
    public final static String COUNTRY_DEF_$$$ = "org.goldman_tribe.arthur.plundr.COUNTRY_DEF_$$$";
    public final static String COUNTRY_DESCRIPTION = "org.goldman_tribe.arthur.plundr.COUNTRY_DESCRIPTION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

    /** Handler for the "Start Browsing" button */
    public void startBrowse(View view) {
        String CountryName = "Put a country name here";
        long CountryDef$$$ = 5L;
        String CountryDescription = "Put something here";
        Intent intent = new Intent(this, BrowseCountries.class);
        intent.putExtra(COUNTRY_NAME, CountryName);
        intent.putExtra(COUNTRY_DEF_$$$, CountryDef$$$);
        intent.putExtra(COUNTRY_DESCRIPTION, CountryDescription);
        startActivity(intent);
    }
}
