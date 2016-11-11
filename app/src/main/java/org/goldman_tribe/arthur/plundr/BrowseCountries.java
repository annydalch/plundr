package org.goldman_tribe.arthur.plundr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Objects;

public class BrowseCountries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_countries);

        RelativeLayout.LayoutParams params =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.MATCH_PARENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);

        Intent intent = getIntent();
        String countryName = intent.getStringExtra(MainActivity.COUNTRY_NAME);
        long countryDef$$$ = intent.getLongExtra(MainActivity.COUNTRY_DEF_$$$, 0L);
        String countryDescription = intent.getStringExtra(MainActivity.COUNTRY_DESCRIPTION);

        TextView Title = new TextView(this);
        Title.setText(countryName);
        Title.setTextSize(40);
        Title.setLayoutParams(params);

        TextView Description = new TextView(this);
        Description.setText(countryDescription);
        Description.setTextSize(25);
        Description.setLayoutParams(params);

        TextView Budget = new TextView(this);
        Budget.setText("$" + Objects.toString(countryDef$$$, null) + " in yearly defense spendings");
        Budget.setTextSize(25);
        Budget.setLayoutParams(params);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_browse_countries);
        layout.addView(Title);
        layout.addView(Budget);
        layout.addView(Description);
    }
}
