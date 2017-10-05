package br.com.darksite.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {

    //variaveis
    static RadioButton respQ2oui1;
    static RadioButton respQ2oui2;
    RadioButton respQ2non;
    String selectedReponseQ2, responseDeLaQuestion1;
    Button btnToQuestion3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2);

        btnToQuestion3 = (Button) findViewById(R.id.btnToQuestion3);
        respQ2oui1 = (RadioButton)findViewById(R.id.radioBtnOuiQuestion2);
        respQ2oui2 = (RadioButton)findViewById(R.id.radioBtnOui2Question2);
        respQ2non = (RadioButton)findViewById(R.id.radioBtnNonQuestion2);

        btnToQuestion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (respQ2oui1.isChecked()) {
                    selectedReponseQ2 = respQ2oui1.getText().toString();
                }
                else if (respQ2oui2.isChecked()){
                    selectedReponseQ2 = respQ2oui2.getText().toString();
                }
                else {
                    selectedReponseQ2 = respQ2non.getText().toString();

                }

                //recuperando dados na primeira activity
                Intent i = getIntent();
                responseDeLaQuestion1 = i.getStringExtra("q1").toString();


                Toast.makeText(getApplicationContext(), selectedReponseQ2, Toast.LENGTH_LONG).show();

                Intent i2 = new Intent(Question2.this, Question3.class);

               // Bundle b = new Bundle();
                i2.putExtra("q1", responseDeLaQuestion1);
                i2.putExtra("q2", selectedReponseQ2);

                startActivity(i2);
            }

        });

    }
}
