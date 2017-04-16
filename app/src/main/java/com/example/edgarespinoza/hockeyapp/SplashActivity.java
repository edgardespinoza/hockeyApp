package com.example.edgarespinoza.hockeyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import net.hockeyapp.android.CrashManager;
import net.hockeyapp.android.UpdateManager;
import net.hockeyapp.android.UpdateManagerListener;
import net.hockeyapp.android.utils.Util;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);




        checkForUpdates();
    }
    @Override
    public void onResume() {
        super.onResume();
        // ... your own onResume implementation
        checkForCrashes();
    }

//    @Override
//    public void onPause() {
//        super.onPause();
//        unregisterManagers();
//    }

//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        unregisterManagers();
//    }

      private void checkForCrashes() {
          CrashManager.register(this);
      }

    private void checkForUpdates() {
        // Remove this for store builds!
        UpdateManager.register(this,  Util.getAppIdentifier(this), new UpdateManagerListener() {
            @Override
            public void onNoUpdateAvailable() {
                Toast.makeText(SplashActivity.this, "No updates found.", Toast.LENGTH_SHORT).show();

                Intent ListSong = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ListSong);
            }
            @Override
            public void onUpdateAvailable() {
                // Something you want to do when an update is available, e.g.
                // enable a button to install the update. Note that the manager
                // shows an alert dialog after the method returns.
            }
        });
    }

//    private void unregisterManagers() {
//      //  UpdateManager.unregister();
//    }
}
