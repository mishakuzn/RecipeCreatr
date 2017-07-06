package com.misha.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                goToSecondActivity();

            }

        });

        setContentView(R.layout.activity_main);
    }

    private void goToSecondActivity() {

        Intent intent = new Intent(this, Main3Activity.class);

        startActivity(intent);

    }
}
