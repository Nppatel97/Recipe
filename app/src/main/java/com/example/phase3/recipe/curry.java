package com.example.phase3.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class curry extends AppCompatActivity {

    private Button button4;
    private Button button2;
    private Button button3;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curry);

        button4 = (Button)findViewById(R.id.button4);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(curry.this, "Recipe added to Health Tracker", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0){
                    button2.setBackgroundResource(R.drawable.liked);
                    i++;
                }else if(i==1){
                    button2.setBackgroundResource(R.drawable.thumbs_up);
                    i--;
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==0){
                    button3.setBackgroundResource(R.drawable.dislike);
                    i++;
                }else if(i==1){
                    button3.setBackgroundResource(R.drawable.thumbs_up);
                    i--;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { switch(item.getItemId()) {
        case R.id.bt_info:
            Intent user_profile = new Intent(this,user_prof.class);
            startActivity(user_profile);
            return(true);
        case R.id.bt_rec:
            Intent recip = new Intent(this,recipes.class);
            startActivity(recip);
            return(true);
        case R.id.bt_saved:
            Intent saved_rec = new Intent(this,saved_rec.class);
            startActivity(saved_rec);
            return(true);
        case R.id.bt_7plan:
            Intent week = new Intent(this,seven_plan.class);
            startActivity(week);
            return(true);
        case R.id.bt_track:
            Intent tracker = new Intent(this,track.class);
            startActivity(tracker);
            return(true);
        case R.id.bt_groupplan:
            Intent groupmeal = new Intent(this,group.class);
            startActivity(groupmeal);
            return(true);
        case R.id.bt_help:
            Intent support = new Intent(this,help.class);
            startActivity(support);
            return(true);
        case R.id.bt_logout:
            Intent leave = new Intent(this,logout.class);
            startActivity(leave);
            return(true);
    }
        return(super.onOptionsItemSelected(item));
    }
}
