package br.com.darksite.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Question3 extends Base {

    String responseDeLaQuestion1, responseDeLaQuestion2, responseDeLaQuestion3;

    Button btnToQuestion4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question3);

        final TextView edtQuestion3 = (TextView) findViewById(R.id.edtQuestion3);

        btnToQuestion4 = (Button)findViewById(R.id.btnToQuestion4);

        btnToQuestion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                responseDeLaQuestion3 = edtQuestion3.getText().toString();

                //recuperando dados na primeira activity
                Intent i = getIntent();
                responseDeLaQuestion1 = i.getStringExtra("q1").toString();
                responseDeLaQuestion2 = i.getStringExtra("q2").toString();



                Toast.makeText(getApplicationContext(), responseDeLaQuestion3, Toast.LENGTH_LONG).show();

                if (Question2.respQ2oui1.isChecked()) {

                    Intent i3 = new Intent(Question3.this, Question4.class);

                    //Bundle b2 = new Bundle();
                    i3.putExtra("q1", responseDeLaQuestion1);
                    i3.putExtra("q2", responseDeLaQuestion2);
                    i3.putExtra("q3", responseDeLaQuestion3);

                    startActivity(i3);

                }
                else if (Question2.respQ2oui2.isChecked()){
                    Intent i3 = new Intent(Question3.this, Question4.class);

                    //Bundle b2 = new Bundle();
                    i3.putExtra("q1", responseDeLaQuestion1);
                    i3.putExtra("q2", responseDeLaQuestion2);
                    i3.putExtra("q3", responseDeLaQuestion3);

                    startActivity(i3);

                }
                else {
                    Intent i3 = new Intent(Question3.this, Resume.class);

                    //Bundle b2 = new Bundle();
                    i3.putExtra("q1", responseDeLaQuestion1);
                    i3.putExtra("q2", responseDeLaQuestion2);
                    i3.putExtra("q3", responseDeLaQuestion3);
                    i3.putExtra("q4", "Non");
                    i3.putExtra("q5", "I do not want to be contacted");

                    startActivity(i3);



                }


            }

        });


     }

}
