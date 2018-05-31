package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.facebook.login.Login;
import com.facebook.login.LoginManager;
import com.facebook.login.widget.LoginButton;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.btn_conf) Button _conferenceButton;
    @BindView(R.id.btn_logout) Button _logoutButton;
    @BindView(R.id.btn_profile) Button _profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);


//        Intent intent = new Intent(this, LoginActivity.class);
//        startActivity(intent);
        _conferenceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
            }
        });

        _logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToMenu(findViewById(R.id.btn_logout));
            }
        });

        _profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
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

    private void navigateToMenu(View view) {
        //check if it's a facebook login
        AccessToken accessToken = AccessToken.getCurrentAccessToken();
        boolean fbIsLoggedIn = accessToken != null && !accessToken.isExpired();

        if (fbIsLoggedIn) {
            LoginManager.getInstance().logOut();
        }

        Intent myIntent = new Intent(MenuActivity.this, LoginActivity.class);
        //myIntent.putExtra("key", value); //Optional parameters
        startActivity(myIntent);

        //Uncomment below to sto user being able to go back to the login Page after they logged in
        //finish();
    }
}
