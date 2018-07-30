package com.rahmahnajiyahimtihan.inputdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bPersegi = (Button) findViewById(R.id.btnpersegi);

        bPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //move to other activity
                Intent a = new Intent(getApplicationContext(), PersegiPanjang.class);
                startActivity(a);
            }

        });
            final Button btnPersegiPanjang = (Button) findViewById(R.id.btnpersegipanjang);

            btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //move to other activity
                    Intent b = new Intent(getApplicationContext(), PersegiPanjang.class);
                    startActivity(b);

                }
            });

        final Button btnLingkaran = (Button) findViewById(R.id.btnlingkaran);

        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //move to other activity
                Intent c = new Intent(getApplicationContext(), Lingkaran.class);
                startActivity(c);
            }
        });

        final Button btnSegitiga = (Button) findViewById(R.id.btnsegitiga);

         btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View view) {
                //move to other activity
                Intent d = new Intent(getApplicationContext(), Segitiga.class);
                startActivity(d);

            }

         });
    }
}