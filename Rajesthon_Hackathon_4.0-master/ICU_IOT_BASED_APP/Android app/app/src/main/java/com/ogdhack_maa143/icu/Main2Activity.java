package com.ogdhack_maa143.icu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void openthree(View view) {
        Intent intent2 = new Intent(this, Main3Activity.class);
        startActivity(intent2);

    }
}


