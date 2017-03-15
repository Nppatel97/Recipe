package com.example.phase3.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.lang.String;
import java.util.Arrays;

public class display extends AppCompatActivity {

    public class Recipe{

        public String name;
        public String ethnicity;
        public int cal;
        public int budget;
        public int time;
        public String difficulty;
        public int popularity;
        public int userRating;

        public Recipe(String name, String ethnicity, int cal, int budget, int time, String difficulty, int popularity, int userRating){
            this.name = name;
            this.ethnicity = ethnicity;
            this.cal = cal;
            this.budget = budget;
            this.time = time;
            this.difficulty = difficulty;
            this.popularity = popularity;
            this.userRating = userRating;
        }
    }

    Recipe[] temp = new Recipe[20];
    public Recipe[] reverse(Recipe[] array){
        for(int i=0; temp[i]!=null; i++){
            temp[i]=null;
        }
        int x=length(array)-1;
        /*while(array[x]!=null){x++;}
        x--;*/

        for(int i=0; x>=0; i++){
            temp[i] = array[x];
            x--;
        }
        return temp;
    }



    public void selectRecipes(){

        int j=0;
        for(int i=0; list[i]!=null; i++){
            if(j==6){break;}
            Recipe current = list[i];

            /*if statement checks if current recipe meets requirements*/
            if((recipes.ethnicityVal.equals(current.ethnicity) || recipes.ethnicityVal.equals("Any")) && recipes.calorieVal>=current.cal && recipes.budgetVal>=current.budget && recipes.timeVal>=current.time && (recipes.difficultyVal.equals(current.difficulty) || recipes.difficultyVal.equals("Any"))){
                /*add recipe to selected recipes*/
                selected[j] = current;
                j++;
            }
        }
    }

    public int size(Recipe[] list){
        int i=0;
        while(list[i]!=null){
            i++;
            if(i==6){break;}
        }
        return i;
    }
    public int length(Recipe[] list){
        int i=0;
        while(list[i]!=null){
            i++;
            if(i==11){break;}
        }
        return i;
    }


    public Recipe[] alphabetize(Recipe[] list, int n){
        /*n = the number of recipes in the list*/

        String[] temp = new String[n];
        for(int i=0; i<n; i++){
            temp[i] = list[i].name;
        }
        Arrays.sort(temp);

        Recipe[] list2 = new Recipe[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(temp[i].equals(list[j].name)){
                    list2[i] = list[j];
                }
            }
        }
        return list2;
    }

    public Recipe[] popularity(Recipe[] array, int n){
        /*n = number of elements in array*/
        Recipe[] temp = new Recipe[n];
        int j=0;
        for(int i=0; i<n; i++){
            if(array[i].popularity==1){
                temp[j]=array[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            if(array[i].popularity==2){
                temp[j]=array[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            if(array[i].popularity==3){
                temp[j]=array[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            if(array[i].popularity==4){
                temp[j]=array[i];
                j++;
            }
        }
        return temp;
    }


    public Recipe[] rating(Recipe[] array, int n){
        /*n = number of elements in array*/
        Recipe[] temp = new Recipe[n];
        int j=0;
        for(int i=0; i<n; i++){
            if(array[i].userRating==1){
                temp[j]=array[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            if(array[i].userRating==2){
                temp[j]=array[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            if(array[i].userRating==3){
                temp[j]=array[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            if(array[i].userRating==4){
                temp[j]=array[i];
                j++;
            }
        }
        return temp;
    }

    static Spinner dropdown;
    static Recipe list[] = new Recipe[20];
    Recipe selected[] = new Recipe[6];
    static Button buttonarray[] = new Button[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        /*Create buttons and add them to button array*/
        Button button = (Button) findViewById(R.id.button);
        buttonarray[0] = button;
        Button button2 = (Button) findViewById(R.id.button2);
        buttonarray[1] = button2;
        Button button3 = (Button) findViewById(R.id.button3);
        buttonarray[2] = button3;
        Button button4 = (Button) findViewById(R.id.button4);
        buttonarray[3] = button4;
        Button button5 = (Button) findViewById(R.id.button5);
        buttonarray[4] = button5;
        Button button6 = (Button) findViewById(R.id.button6);
        buttonarray[5] = button6;

        /*Spinner and "Set Order" button*/
        dropdown = (Spinner)findViewById(R.id.spinner);
        String[] items = new String[]{"A-Z", "Z-A", "Popularity", "User Rating"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        Button order = (Button) findViewById(R.id.button7);



        /*Create recipes & add them to list*/
        Recipe MacandCheese = new Recipe("Mac & Cheese", "North American", 500, 15, 20, "Easy", 1, 3);
        list[0] = MacandCheese;
        Recipe sushi = new Recipe("Sushi", "Asian", 250, 20, 45, "Medium", 3, 1);
        list[1] = sushi;
        Recipe hamburger = new Recipe("Hamburgers", "North American", 500, 20, 30, "Medium", 1, 2);
        list[2] = hamburger;
        Recipe pizza = new Recipe("Pizza", "European", 700, 30, 30, "Easy", 1, 1);
        list[3] = pizza;
        Recipe empanadas = new Recipe("Empanadas", "South American", 400, 20, 40, "Hard", 4, 1);
        list[4] = empanadas;
        Recipe currychicken = new Recipe("Curry Chicken", "Asian", 400, 20, 30, "Medium", 3, 2);
        list[5] = currychicken;
        Recipe raviolli = new Recipe("Raviolli", "European", 500, 30, 60, "Hard", 3, 4);
        list[6] = raviolli;
        Recipe blt = new Recipe("BLT Sandwiches", "North American", 350, 15, 20, "Easy", 2, 4);
        list[7] = blt;
        Recipe spaghetti = new Recipe("Spaghetti", "European", 500, 15, 25, "Easy", 1, 2);
        list[8] = spaghetti;
        Recipe qbb = new Recipe("Quinoa & Black Beans", "South American", 500, 20, 30, "Medium", 3, 2);
        list[9] = qbb;
        Recipe thaiCsoup = new Recipe("Thai Coconut Soup", "Asian", 300, 20, 45, "Medium", 4, 1);
        list[10] = thaiCsoup;

        /*FOR ORDERING: REARRANGE list[] ONLY*/

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = display.dropdown.getSelectedItem().toString();

                if(text.equals("A-Z")){
                    list = alphabetize(list, length(list));
                }
                else if(text.equals("Z-A")){
                    list = alphabetize(list, length(list));
                    list = reverse(list);
                }
                else if(text.equals("Popularity")){
                    list = popularity(list, length(list));
                }
                else{
                    list = rating(list, length(list));
                }

                /*selectRecipes();*/
                int z = size(selected);
                int j=0;
                for(int i=0; i<=length(list); i++){
                    if(j==z){break;}
                    Recipe currentR = list[i];

                    /*if statement checks if current recipe meets requirements*/
                    if((recipes.ethnicityVal.equals(currentR.ethnicity) || recipes.ethnicityVal.equals("Any")) && recipes.calorieVal>=currentR.cal && recipes.budgetVal>=currentR.budget && recipes.timeVal>=currentR.time && (recipes.difficultyVal.equals(currentR.difficulty) || recipes.difficultyVal.equals("Any"))){
                    /*add recipe to selected recipes*/
                        selected[j] = currentR;
                        j++;
                    }
                }


                int i=0;
                while(i<size(selected)){
                    buttonarray[i].setText(selected[i].name);
                    i++;
                }

                /*remove unused buttons*/
                while(i<6){
                    buttonarray[i].setVisibility(View.INVISIBLE);
                    i++;
                }

            }
        });


        selectRecipes();


        /*assign buttons recipe names*/
        int i=0;
        while(i<size(selected)){
            buttonarray[i].setText(selected[i].name);
            i++;
        }

        /*remove unused buttons*/
        while(i<6){
            buttonarray[i].setVisibility(View.INVISIBLE);
            i++;
        }

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(display.this, blt.class);
                startActivity(i1);

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i2 = new Intent(display.this, curry.class);
                startActivity(i2);

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
