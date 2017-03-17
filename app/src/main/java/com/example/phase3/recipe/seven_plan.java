package com.example.phase3.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

import static com.example.phase3.recipe.R.id.day1recipe;
import static com.example.phase3.recipe.R.id.day2recipe;
import static com.example.phase3.recipe.R.id.day3recipe;
import static com.example.phase3.recipe.R.id.day4recipe;
import static com.example.phase3.recipe.R.id.day5recipe;
import static com.example.phase3.recipe.R.id.day6recipe;
import static com.example.phase3.recipe.R.id.day7recipe;
import static com.example.phase3.recipe.R.id.ethnicitytext;

public class seven_plan extends AppCompatActivity {


    static Spinner recipespinner1;
    static Spinner recipespinner2;
    static Spinner recipespinner3;
    static Spinner recipespinner4;
    static Spinner recipespinner5;
    static Spinner recipespinner6;
    static Spinner recipespinner7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_plan);

        Button btn1 =(Button)findViewById(R.id.addnew1);
        Button btn2 =(Button)findViewById(R.id.addnew2);
        Button btn3 =(Button)findViewById(R.id.addnew3);
        Button btn4 =(Button)findViewById(R.id.addnew4);
        Button btn5 =(Button)findViewById(R.id.addnew5);
        Button btn6 =(Button)findViewById(R.id.addnew6);
        Button btn7 =(Button)findViewById(R.id.addnew7);

        String[] items1 = new String[]{"Select A Recipe", "Garlic Chicken", "Penne With Spring Vegetables", "Curry Chicken"};
        //String[] items2 = new String[]{"Select A Recipe", "Garlic Chicken", "Penne With Spring Veg", "Curry Chicken"};

        recipespinner1 = (Spinner)findViewById(day1recipe);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        recipespinner1.setAdapter(adapter1);

        recipespinner2 = (Spinner)findViewById(day2recipe);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        recipespinner2.setAdapter(adapter2);

        recipespinner3 = (Spinner)findViewById(day3recipe);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        recipespinner3.setAdapter(adapter3);

        recipespinner4 = (Spinner)findViewById(day4recipe);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        recipespinner4.setAdapter(adapter4);

        recipespinner5 = (Spinner)findViewById(day5recipe);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        recipespinner5.setAdapter(adapter5);

        recipespinner6 = (Spinner)findViewById(day6recipe);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        recipespinner6.setAdapter(adapter6);

        recipespinner7 = (Spinner)findViewById(day7recipe);
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        recipespinner7.setAdapter(adapter7);

        ImageButton del1 = (ImageButton)findViewById(R.id.delete1);
        ImageButton del2 = (ImageButton)findViewById(R.id.delete2);
        ImageButton del3 = (ImageButton)findViewById(R.id.delete3);
        ImageButton del4 = (ImageButton)findViewById(R.id.delete4);
        ImageButton del5 = (ImageButton)findViewById(R.id.delete5);
        ImageButton del6 = (ImageButton)findViewById(R.id.delete6);
        ImageButton del7 = (ImageButton)findViewById(R.id.delete7);

        final FrameLayout fl1 = (FrameLayout) findViewById(R.id.inner_panel1);
        final FrameLayout fl2 = (FrameLayout) findViewById(R.id.inner_panel2);
        final FrameLayout fl3 = (FrameLayout) findViewById(R.id.inner_panel3);
        final FrameLayout fl4 = (FrameLayout) findViewById(R.id.inner_panel4);
        final FrameLayout fl5 = (FrameLayout) findViewById(R.id.inner_panel5);
        final FrameLayout fl6 = (FrameLayout) findViewById(R.id.inner_panel6);
        final FrameLayout fl7 = (FrameLayout) findViewById(R.id.inner_panel7);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fl1.setVisibility(View.VISIBLE);
            }
        });

        del1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                fl1.setVisibility(View.INVISIBLE);
                recipespinner1.setSelection(0);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fl2.setVisibility(View.VISIBLE);
            }
        });

        del2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                fl2.setVisibility(View.INVISIBLE);
                recipespinner2.setSelection(0);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fl3.setVisibility(View.VISIBLE);
            }
        });

        del3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                fl3.setVisibility(View.INVISIBLE);
                recipespinner3.setSelection(0);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fl4.setVisibility(View.VISIBLE);
            }
        });

        del4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                fl4.setVisibility(View.INVISIBLE);
                recipespinner4.setSelection(0);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fl5.setVisibility(View.VISIBLE);
            }
        });

        del5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                fl5.setVisibility(View.INVISIBLE);
                recipespinner5.setSelection(0);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fl6.setVisibility(View.VISIBLE);
            }
        });

        del6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                fl6.setVisibility(View.INVISIBLE);
                recipespinner6.setSelection(0);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                fl7.setVisibility(View.VISIBLE);
            }
        });

        del7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                fl7.setVisibility(View.INVISIBLE);
                recipespinner7.setSelection(0);
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
