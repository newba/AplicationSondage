package br.com.darksite.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Question4 extends Base {

    //variaveis
    RadioButton respQ4oui, respQ4non;
    String selectedReponseQ4, responseDeLaQuestion1, responseDeLaQuestion2, responseDeLaQuestion3;
    Button btnToQuestion5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question4);

        btnToQuestion5 = (Button)findViewById(R.id.btnToQuestion5);
        respQ4oui = (RadioButton)findViewById(R.id.radioBtnOuiQuestion4);
        respQ4non = (RadioButton)findViewById(R.id.radioBtnNonQuestion4);

        btnToQuestion5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (respQ4oui.isChecked()) {
                    selectedReponseQ4 = respQ4oui.getText().toString();
                    Intent i = getIntent();
                    responseDeLaQuestion1 = i.getStringExtra("q1").toString();
                    responseDeLaQuestion2 = i.getStringExtra("q2").toString();
                    responseDeLaQuestion3 = i.getStringExtra("q3").toString();

                    Intent i4 = new Intent(Question4.this, Question5.class);

                    //Bundle b2 = new Bundle();
                    i4.putExtra("q1", responseDeLaQuestion1);
                    i4.putExtra("q2", responseDeLaQuestion2);
                    i4.putExtra("q3", responseDeLaQuestion3);
                    i4.putExtra("q4", selectedReponseQ4);

                    Toast.makeText(getApplicationContext(), selectedReponseQ4, Toast.LENGTH_LONG).show();

                    startActivity(i4);
                }
                else {
                    selectedReponseQ4 = respQ4non.getText().toString();
                    //recuperando dados na primeira activity
                    Intent i = getIntent();
                    responseDeLaQuestion1 = i.getStringExtra("q1").toString();
                    responseDeLaQuestion2 = i.getStringExtra("q2").toString();
                    responseDeLaQuestion3 = i.getStringExtra("q3").toString();

                    Intent i4 = new Intent(Question4.this, Resume.class);

                    //Bundle b2 = new Bundle();
                    i4.putExtra("q1", responseDeLaQuestion1);
                    i4.putExtra("q2", responseDeLaQuestion2);
                    i4.putExtra("q3", responseDeLaQuestion3);
                    i4.putExtra("q4", selectedReponseQ4);
                    i4.putExtra("q5", "I do not want to be contacted");

                    Toast.makeText(getApplicationContext(), selectedReponseQ4, Toast.LENGTH_LONG).show();

                    startActivity(i4);
                }


            }
        });
    }

}
