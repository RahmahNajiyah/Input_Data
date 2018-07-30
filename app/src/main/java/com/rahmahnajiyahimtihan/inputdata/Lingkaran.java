package com.rahmahnajiyahimtihan.inputdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Lingkaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        Button btn3 = (Button) findViewById(R.id.hitungLingkaran);
        final EditText edt3 = (EditText) findViewById(R.id.editSisi3);
        final TextView txt3 = (TextView) findViewById(R.id.hasilLingkaran);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(edt3.getText())) {
                    Toast.makeText(Lingkaran.this, "inputan masih kosong", Toast.LENGTH_SHORT).show();
                }else {
                    float phi = (float) 3.14;
                    float r2 = Float.parseFloat(edt3.getText().toString());
                    float hasil = phi * r2 * r2;
                    txt3.setText(hasil+"");
                }

            }
        });
    }
}


