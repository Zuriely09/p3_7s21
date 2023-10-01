package mx.edu.isc.tesoem.CEJZ.p3_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resta2numActivity extends AppCompatActivity {

    EditText txtnum1, txtnum2;
    TextView lblrest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta2num);

        setContentView(R.layout.activity_resta2num);

        txtnum1 = findViewById(R.id.txtnum1p4);
        txtnum2 = findViewById(R.id.txtnum2p4);
        lblrest = findViewById(R.id.lblresp4);
    }

    public void calcular(View v){
        int num1 = Integer.parseInt(txtnum1.getText().toString());
        int num2 = Integer.parseInt(txtnum2.getText().toString());
        lblrest.setText(String.valueOf(num1-num2));
    }
}