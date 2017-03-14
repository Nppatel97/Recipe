package com.example.phase3.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

import static com.example.phase3.recipe.R.id.difficultytext;
import static com.example.phase3.recipe.R.id.ethnicitytext;

public class recipes extends AppCompatActivity {

    EditText calorievaltxt; /*number variable*/
    EditText budgetvaltxt; /*number variable*/
    EditText timevaltxt; /*number variable*/

    static Spinner ethnicitydrop;
    static Spinner difficultydrop;

    static String ethnicityVal;
    static float calorieVal;
    static float budgetVal;
    static float timeVal;
    static String difficultyVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        calorievaltxt = (EditText) findViewById(R.id.calorievaltxt);
        budgetvaltxt = (EditText) findViewById(R.id.budgetvaltxt);
        timevaltxt = (EditText) findViewById(R.id.timevaltxt);

        ethnicitydrop = (Spinner)findViewById(ethnicitytext);
        String[] items1 = new String[]{"Asian", "North American", "South American", "European", "Any"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        ethnicitydrop.setAdapter(adapter);

        difficultydrop = (Spinner)findViewById(difficultytext);
        String[] items2 = new String[]{"Easy", "Medium", "Hard", "Any"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        difficultydrop.setAdapter(adapter2);

        ethnicityVal = recipes.ethnicitydrop.getSelectedItem().toString();
        difficultyVal = recipes.difficultydrop.getSelectedItem().toString();

        Button searchBtn = (Button) findViewById(R.id.searchBtn); /*may need to make public*/
        searchBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                if (  ( !ethnicityVal.equals("")) && ( !calorievaltxt.getText().toString().equals("")) && ( !budgetvaltxt.getText().toString().equals("") ) && ( !timevaltxt.getText().toString().equals("") ) && ( !difficultyVal.equals("") ) ) {

                    calorieVal = Float.parseFloat(calorievaltxt.getText().toString());
                    budgetVal = Float.parseFloat(budgetvaltxt.getText().toString());
                    timeVal = Float.parseFloat(timevaltxt.getText().toString());
                    ethnicityVal = recipes.ethnicitydrop.getSelectedItem().toString();
                    difficultyVal = recipes.difficultydrop.getSelectedItem().toString();


                    Intent press = new Intent(recipes.this, display.class);
                    startActivity(press);
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
