package br.com.darksite.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Base extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the main; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Inflate the main; this adds items to the action bar if it is present.
        //int id = item.getItemId();

        switch (item.getItemId()) {
            case R.id.action_newgame:
                Intent intent = new Intent(this, Main.class);
                startActivity(intent);
                return true;
            case R.id.action_about:
                Toast.makeText(getApplicationContext(),"TP - Marcelo et Rafael", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_version:
                Toast.makeText(getApplicationContext(),"Version 05.10.17!", Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_contact:
                Toast.makeText(getApplicationContext(),"mmsprogramador@gmail.com", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
