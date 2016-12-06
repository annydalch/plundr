package org.goldman_tribe.arthur.plundr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MatchFound extends AppCompatActivity {

    protected void clickHandler(View view) {
        finish();
        //add some real code in here one day
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_match_found);

        Intent intent = getIntent();
        
        TextView title = (TextView)findViewById(R.id.fullscreen_title);

        title.setText(intent.getStringExtra(MainActivity.COUNTRY_NAME));
    }

}
