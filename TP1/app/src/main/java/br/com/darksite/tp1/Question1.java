package br.com.darksite.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

}

