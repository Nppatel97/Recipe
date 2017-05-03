package com.example.phase3.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.data;

public class Create extends AppCompatActivity {
    Button bt_return_start;
    Button bt_reg;
    private EditText enter_email;
    private EditText enter_pass;
    private EditText check_pass;
    private TextView create_success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        bt_return_start = (Button)findViewById(R.id.bt_return_start);
        bt_reg = (Button)findViewById(R.id.bt_reg);

        bt_return_start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Intent code for open new activity through intent.

                Intent intent = new Intent(Create.this, start.class);
                startActivity(intent);
            }
        });

        enter_pass = (EditText) findViewById(R.id.enter_pass);
        check_pass = (EditText) findViewById(R.id.check_pass);

        bt_reg.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass1 = String.valueOf(enter_pass.getText());
                String pass2 = String.valueOf(check_pass.getText());

                if(pass1.equals(pass2)){
                    Toast.makeText(getApplicationContext(), "Account Successfully Created! Press Sign-In to continue", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Oops! Passwords don't match, please try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
