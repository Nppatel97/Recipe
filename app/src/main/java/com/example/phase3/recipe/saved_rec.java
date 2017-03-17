package com.example.phase3.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import java.util.ArrayList;

import java.util.Arrays;

public class saved_rec extends AppCompatActivity {
    ListView lv;
    SearchView sv;
    static ArrayList<String> recipe = new ArrayList<String>();;
    //static String [] recipe = {"Garlic Chicken","Penne with Spring Vegetables","Curry Chicken"};
    static ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_rec);

        lv = (ListView) findViewById(R.id.lv1);
        sv = (SearchView)findViewById(R.id.srch1);
        if(recipe.size()==0) {
            recipe.add("Garlic Chicken");
            recipe.add("Penne with Spring Vegetables");
        }
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,recipe);
        lv.setAdapter(adapter);
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String text) {
                adapter.getFilter().filter(text);
                return false;
            }
        });


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Intent first_pick = new Intent(saved_rec.this,specific1.class);
                        startActivity(first_pick);
                        break;
                    case 1:
                        Intent sec_pick = new Intent(saved_rec.this,specific2.class);
                        startActivity(sec_pick);
                        break;
                    case 2:
                        Intent third_pick = new Intent(saved_rec.this,curry.class);
                        startActivity(third_pick);
                        break;
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

    public static void add (String e){
        recipe.add(e);
    }

    public static void rem (String e){
        recipe.remove(e);
    }
}
