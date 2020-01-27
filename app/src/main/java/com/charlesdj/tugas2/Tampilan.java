package com.charlesdj.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tampilan extends AppCompatActivity {

    TextView Vdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);

        Vdata = (TextView) findViewById(R.id.viewNPM);

        Intent data = getIntent();
        String npm = data.getStringExtra("npm");
        String nama = data.getStringExtra("nama");

        Vdata.setText(npm +"\n" + nama);
    }

    @Override
    public void onBackPressed() {

        Intent back = new Intent(Tampilan.this, MainActivity.class);
        startActivity(back);
        finish();
    }
}
