package fr.long_pixel.calculeimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final TextView result = (TextView) findViewById(R.id.textViewResult);
        final EditText poids = (EditText) findViewById(R.id.editTextKG);
        final EditText taille = (EditText) findViewById(R.id.editTextCM);
        Button bouton = (Button) findViewById(R.id.button);

        bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cm = taille.getText().toString();
                String kg = poids.getText().toString();

                float cmValue = Float.valueOf(cm);
                float kgValue = Float.valueOf(kg);

                cmValue = cmValue / 100;

                cmValue = (float)Math.pow(cmValue, 2);
                float imc = kgValue / cmValue;

                result.setText(String.valueOf(imc));


            }
        });
    }
}
