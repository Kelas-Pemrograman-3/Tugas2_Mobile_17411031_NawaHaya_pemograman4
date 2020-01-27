package com.charlesdj.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtnpm;
    EditText edtnama;
    Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtnpm = (EditText) findViewById(R.id.edtNPM);
        edtnama = (EditText) findViewById(R.id.edtNAMA);

        btnsend = (Button) findViewById(R.id.btnSEND);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String npm = edtnpm.getText().toString();
                String nama = edtnama.getText().toString();

                Intent lanjut = new Intent(MainActivity.this,Tampilan.class);

                lanjut.putExtra("npm", npm);
                lanjut.putExtra("nama", nama);

                startActivity(lanjut);
                finish();
            }
        });
    }
}
