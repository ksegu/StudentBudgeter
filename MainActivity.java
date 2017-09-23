package com.example.kishan_s.budgetbalancer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    public static Money money;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText budgetInput = (EditText) findViewById(R.id.budgetInput);

        final EditText rentInput = (EditText) findViewById(R.id.rentInput);

        final EditText taxInput = (EditText) findViewById(R.id.taxInput);

        final EditText groceriesInput = (EditText) findViewById(R.id.groceriesInput);

        final EditText restaurantsInput = (EditText) findViewById(R.id.restaurantsInput);

        final EditText clothesInput = (EditText) findViewById(R.id.clothesInput);

        final EditText eduSuppliesInput = (EditText) findViewById(R.id.eduSuppliesInput);



        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                double budgetNum = Double.parseDouble(budgetInput.getText().toString());
                double rentNum = Double.parseDouble(rentInput.getText().toString());
                double taxNum = Double.parseDouble(taxInput.getText().toString());
                double groceriesNum = Double.parseDouble(groceriesInput.getText().toString());
                double foodNum = Double.parseDouble(restaurantsInput.getText().toString());
                double clothesNum = Double.parseDouble(clothesInput.getText().toString());
                double eduNum = Double.parseDouble(eduSuppliesInput.getText().toString());
                double [] possibleCosts = {budgetNum, rentNum, taxNum, groceriesNum, foodNum, clothesNum, eduNum};

                money = new Money(possibleCosts);

                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
                startActivity(intent);




            }


        });


    }



}



