package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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

    /*
    Would rather not use hard-coded strings here.
    If this were ASP.NET, I would get the text from the button and have only one onClick method.
    Not sure how or if this is possible in Java, or if I could reference a string resource and
        use it both here and in the layout for the buttons
    */
    public void btnSpotifyClick(View view) {
        displayToast("Spotify Streamer App");
    }

    public void btnScoresClick(View view) {
        displayToast("Scores App");
    }

    public void btnLibraryClick(View view) {
        displayToast("Library App");
    }

    public void btnBiggerClick(View view) {
        displayToast("Build it Bigger App");
    }

    public void btnXyzClick(View view) {
        displayToast("XYZ Reader App");
    }

    public void btnCapstoneClick(View view) {
        displayToast("Capstone App");
    }

    // Display message from button click
    private void displayToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        String msgStart = "This button launches my ";

        Toast.makeText(context, msgStart + text, duration).show();
    }
}
