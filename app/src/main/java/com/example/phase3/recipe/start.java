package com.example.phase3.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.phase3.recipe.R.id.activity_create;

public class start extends AppCompatActivity {
    private EditText email_add;
    private EditText pass_word;
    private Button bt_singIn;
    private Button bt_create;
    private TextView tv_Error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        bt_create = (Button)findViewById(R.id.bt_create);

        bt_create.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Intent code for open new activity through intent.

                Intent intent = new Intent(start.this, Create.class);
                startActivity(intent);

            }
        });

        email_add = (EditText) findViewById(R.id.email_add);
        pass_word = (EditText) findViewById(R.id.pass_word);
        bt_singIn = (Button) findViewById(R.id.bt_signIn);
        tv_Error = (TextView) findViewById(R.id.tv_Error);


        bt_singIn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = String.valueOf(email_add.getText());
                String pass = String.valueOf(pass_word.getText());

                if(email.equals("bob@gmail.com")&& pass.equals("bob123")){
                    setContentView(R.layout.activity_main_menu);
                }else{
                    tv_Error.setText("Incorrect email or password");
                }
            }
        });
    }

}
