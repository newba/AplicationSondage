package br.com.darksite.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Question5 extends AppCompatActivity {

    String responseDeLaQuestion1, responseDeLaQuestion2, responseDeLaQuestion3, responseDeLaQuestion4, responseDeLaQuestion5;

    Button btnToResume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question5);

        final TextView edtEmailQuestion5 = (TextView) findViewById(R.id.edtEmailQuestion5);

        btnToResume = (Button)findViewById(R.id.btnToResume);
        btnToResume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                responseDeLaQuestion5 = edtEmailQuestion5.getText().toString();

                //recuperando dados na primeira activity
                Intent i = getIntent();
                responseDeLaQuestion1 = i.getStringExtra("q1").toString();
                responseDeLaQuestion2 = i.getStringExtra("q2").toString();
                responseDeLaQuestion3 = i.getStringExtra("q3").toString();
                responseDeLaQuestion4 = i.getStringExtra("q4").toString();


                Intent i5 = new Intent(Question5.this, Resume.class);

                //Bundle b2 = new Bundle();
                i5.putExtra("q1", responseDeLaQuestion1);
                i5.putExtra("q2", responseDeLaQuestion2);
                i5.putExtra("q3", responseDeLaQuestion3);
                i5.putExtra("q4", responseDeLaQuestion4);
                i5.putExtra("q5", responseDeLaQuestion5);

                Toast.makeText(getApplicationContext(), responseDeLaQuestion5, Toast.LENGTH_LONG).show();

                startActivity(i5);
            }
        });
    }

}
