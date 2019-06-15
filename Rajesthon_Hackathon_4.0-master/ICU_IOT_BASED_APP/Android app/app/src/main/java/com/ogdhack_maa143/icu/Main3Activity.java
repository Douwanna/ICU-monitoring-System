package com.ogdhack_maa143.icu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void openfourth(View view)
    {
        Toast toas = Toast.makeText(this, "Alert EMERGENCY!", Toast.LENGTH_LONG);
        toas.show();
        Intent intent2  = new Intent (this , Main4Activity.class);
        startActivity(intent2);
        finish();
    }
}
