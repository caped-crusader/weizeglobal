package org.jitsi.meet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.btn_conf) Button _conferenceButton;
    //@BindView(R.id.btn_logout) Button _logoutButton;
    @BindView(R.id.btn_profile) Button _profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);


        _conferenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToConference(findViewById(R.id.btn_conf));

            }
        });

//        _logoutButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                navigateToMenu(findViewById(R.id.btn_logout));
//            }
//        });

        _profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToWeb(findViewById(R.id.btn_profile));
            }
        });
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

    private void navigateToWeb(View view) {
        Intent myIntent = new Intent(MenuActivity.this, WebActivity.class);
        startActivity(myIntent);

        //Uncomment below to sto user being able to go back to the login Page after they logged in
        //finish();
    }

    private void navigateToConference(View view) {
        Intent myIntent = new Intent(MenuActivity.this, ConferenceActivity.class);
        //myIntent.putExtra("key", value); //Optional parameters
        startActivity(myIntent);

        //Uncomment below to sto user being able to go back to the login Page after they logged in
        //finish();
    }
}


