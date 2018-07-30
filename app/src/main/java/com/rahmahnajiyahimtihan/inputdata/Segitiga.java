package com.rahmahnajiyahimtihan.inputdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        Button btn4 = (Button) findViewById(R.id.hitungSegitiga);
        final EditText edt4 = (EditText) findViewById(R.id.editSisi4);
        final EditText edt44 = (EditText) findViewById(R.id.editSisi44);
        final TextView txt4 = (TextView) findViewById(R.id.hasilSegitiga);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(edt4.getText())) {
                    Toast.makeText(Segitiga.this, "inputan masih kosong", Toast.LENGTH_SHORT).show();
                } else {
                    float a = Float.parseFloat(edt4.getText().toString());
                    float t = Float.parseFloat(edt44.getText().toString());
                    float hasil = a * t / 2;
                    txt4.setText(hasil + "");
                }


            }
        });

    }
}