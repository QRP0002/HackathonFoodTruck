package com.example.quinn.foodtruck;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Customer extends ActionBarActivity {
    private Button mViewMapButton;
    private Button mBusOneButton;
    private Button mBusTwoButton;
    private Button mBusThreeButton;
    private Button mBusFourButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);


        mViewMapButton = (Button)findViewById(R.id.view_map);
        mViewMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customer.this, Map.class);
                startActivity(intent);
            }
        });
        mBusOneButton = (Button)findViewById(R.id.truck_button_one);
        mBusOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customer.this, ViewTruck.class);
                startActivity(intent);
            }
        });
        mBusTwoButton = (Button)findViewById(R.id.truck_button_two);
        mBusTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customer.this, ViewTruck.class);
                startActivity(intent);
            }
        });
        mBusThreeButton = (Button)findViewById(R.id.truck_button_three);
        mBusThreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customer.this, ViewTruck.class);
                startActivity(intent);
            }
        });
        mBusFourButton = (Button)findViewById(R.id.truck_button_four);
        mBusFourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customer.this, ViewTruck.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_customer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
