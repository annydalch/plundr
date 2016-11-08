package org.goldman_tribe.arthur.plundr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BrowseCountries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_countries);

        Intent intent = getIntent();
        String countryName = intent.getStringExtra(MainActivity.COUNTRY_NAME);
        long countryDef$$$ = intent.getLongExtra(MainActivity.COUNTRY_DEF_$$$, 0L);
        String countryDescription = intent.getStringExtra(MainActivity.COUNTRY_DESCRIPTION);
    }
}
