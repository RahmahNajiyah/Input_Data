package com.rahmahnajiyahimtihan.inputdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PersegiPanjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        Button btn2 = (Button) findViewById(R.id.hitungPersegiPanjang);
        final EditText edt2 = (EditText) findViewById(R.id.editSisi2);
        final EditText edt22 = (EditText) findViewById(R.id.editSisi22);
        final TextView txt2 = (TextView) findViewById(R.id.hasilPersegiPanjang);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(edt2.getText().toString()) && TextUtils.isEmpty(edt2.getText())) {
                    Toast.makeText(PersegiPanjang.this, "inputan masih kosong", Toast.LENGTH_SHORT).show();
                }else {
                    float a = Float.parseFloat(edt2.getText().toString());
                    float r = Float.parseFloat(edt22.getText().toString());
                    float hasil = a * r;
                    txt2.setText(hasil+"");
                }

            }
        });
    }
}
