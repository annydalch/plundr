package org.goldman_tribe.arthur.plundr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;

public class BrowseCountries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_countries);

        Intent intent = getIntent();
        String countryName = intent.getStringExtra(MainActivity.COUNTRY_NAME);
        long countryDef$$$ = intent.getLongExtra(MainActivity.COUNTRY_DEF_$$$, 0L);
        String countryDescription = intent.getStringExtra(MainActivity.COUNTRY_DESCRIPTION);

        TextView Title = (TextView)findViewById(R.id.country_name);
        Title.setText(countryName);

        TextView Description = (TextView)findViewById(R.id.country_description);
        Description.setText(countryDescription);

        TextView Budget = (TextView)findViewById(R.id.country_budget);
        Budget.setText("$" + Objects.toString(countryDef$$$, null) + " in yearly defense spendings");

        this.findViewById(android.R.id.content).setOnTouchListener(new OnSwipeTouchListener(this) {
            @Override
            public void onSwipeRight() {
                String newCountryName = "Second filler";
                long newCountryDef$$$ = 10L;
                String newCountryDescription = "Fill this in";
                Intent intent = new Intent(getApplicationContext(), BrowseCountries.class);
                intent.putExtra(MainActivity.COUNTRY_NAME, newCountryName);
                intent.putExtra(MainActivity.COUNTRY_DEF_$$$, newCountryDef$$$);
                intent.putExtra(MainActivity.COUNTRY_DESCRIPTION, newCountryDescription);
                startActivity(intent);
                finish();
            }
            public void onSwipeLeft() {
                
            }
        });
    }


}
