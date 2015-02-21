package com.example.quinn.foodtruck;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    private Button mAdminButton;
    private Button mTruckButton;
    private Button mCustomerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdminButton = (Button)findViewById(R.id.admin_button);
        mTruckButton = (Button)findViewById(R.id.truck_button);
        mCustomerButton = (Button)findViewById(R.id.customer_button);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void adminLogin (View view) {
        Intent intent = new Intent(this, AdminLogin.class);
        startActivity(intent);
    }

    public void truckLogin (View view) {
        Intent intent = new Intent(this, TruckLogin.class);
        startActivity(intent);
    }

    public void customerPage (View view) {
        Intent intent = new Intent(this, Customer.class);
        startActivity(intent);
    }
}
