package com.example.phase3.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class forgot extends AppCompatActivity {
    private Button button8;
    private Button bt_reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);

        button8 = (Button)findViewById(R.id.button8);
        bt_reset = (Button)findViewById(R.id.bt_reset);

        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Intent code for open new activity through intent.

                Intent intent1 = new Intent(forgot.this, start.class);
                startActivity(intent1);

            }
        });

        bt_reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(forgot.this, "Reset email sent", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
