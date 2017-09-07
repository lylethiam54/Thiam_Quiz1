package com.thiam.thiam_quiz1;

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
    }

    public void nextActivity (View view)
    {
        Intent intent = new Intent(this,ActivityTwo.class);
        startActivity(intent);
    }
    Button btn =(Button)findViewById(R.id.mybutton
}
