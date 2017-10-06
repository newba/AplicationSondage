package br.com.darksite.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resume extends AppCompatActivity {

    String responseDeLaQuestion1, responseDeLaQuestion2, responseDeLaQuestion3, responseDeLaQuestion4, responseDeLaQuestion5;
    TextView respQuestion1, respQuestion2, respQuestion3, respQuestion4, respQuestion5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resume);

        Intent i = getIntent();
        responseDeLaQuestion1 = i.getStringExtra("q1").toString();
        responseDeLaQuestion2 = i.getStringExtra("q2").toString();
        responseDeLaQuestion3 = i.getStringExtra("q3").toString();
        responseDeLaQuestion4 = i.getStringExtra("q4").toString();
        responseDeLaQuestion5 = i.getStringExtra("q5").toString();

        respQuestion1 = (TextView)findViewById(R.id.respQuestion1);
        respQuestion1.setText(responseDeLaQuestion1);

        respQuestion2 = (TextView)findViewById(R.id.respQuestion2);
        respQuestion2.setText(responseDeLaQuestion2);

        respQuestion3 = (TextView)findViewById(R.id.respQuestion3);
        respQuestion3.setText(responseDeLaQuestion3);

        respQuestion4 = (TextView)findViewById(R.id.respQuestion4);
        respQuestion4.setText(responseDeLaQuestion4);

        respQuestion5 = (TextView)findViewById(R.id.respQuestion5);
        respQuestion5.setText(responseDeLaQuestion5);
    }

    public void click(View v){
        Intent intent = new Intent(Resume.this, Main.class);
        startActivity(intent);
    }
}
