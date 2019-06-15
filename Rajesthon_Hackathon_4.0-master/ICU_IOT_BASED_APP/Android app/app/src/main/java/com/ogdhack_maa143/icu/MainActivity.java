package com.ogdhack_maa143.icu;

import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText usern,pwd;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usern=(EditText)findViewById(R.id.user);
        pwd=(EditText)findViewById(R.id.pwd);
    }
    public void openSecond(View View)
    {
        String usename =usern.getText().toString();
        String passwd=pwd.getText().toString();
        String type="login";
        background back=new background(this);
        back.execute(type,usename,passwd);

    }
    public void openSecond2(View view)
    {
        Intent intent  = new Intent (this , Main2Activity.class);
        startActivity(intent);
        finish();
    }
}