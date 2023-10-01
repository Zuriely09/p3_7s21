package mx.edu.isc.tesoem.CEJZ.p3_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button btnsuma2num3;
    Button btnres2num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnsuma2num3 = findViewById(R.id.p2btnsuma);
        btnres2num3 = findViewById(R.id.p2btnresta);

        btnsuma2num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lanza = new Intent(MenuActivity.this, Suma2numActivity.class);
                startActivity(lanza);
            }
        });

        btnres2num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lanza = new Intent(MenuActivity.this, Resta2numActivity.class);
                startActivity(lanza);
            }
        });
    }
}