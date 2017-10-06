package br.com.darksite.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


public class Question1 extends AppCompatActivity {

    //variaveis
    RadioButton respQ1oui, respQ1non;
    String selectedReponse;
    Button btnToQuestion2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);

        respQ1oui = (RadioButton)findViewById(R.id.radioBtnOuiQuestion1);
        respQ1non = (RadioButton)findViewById(R.id.radioBtnNonQuestion1);
        btnToQuestion2 = (Button) findViewById(R.id.btnToQuestion2);

        btnToQuestion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (respQ1oui.isChecked()) {
                    selectedReponse = respQ1oui.getText().toString();
                }
                else {
                    selectedReponse = respQ1non.getText().toString();
                }

                Intent i = new Intent(Question1.this, Question2.class);

                Toast.makeText(getApplicationContext(), selectedReponse, Toast.LENGTH_LONG).show();


                //Bundle b = new Bundle();

                i.putExtra("q1", selectedReponse);
                startActivity(i);
            }
        });
    }

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
                Intent intent = new Intent(Question1.this, Main.class);
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

