package com.example.quinn.foodtruck;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class AddItem extends ActionBarActivity {
    private Button mAddItemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        mAddItemButton = (Button)findViewById(R.id.add_item);
        mAddItemButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText nameText = (EditText) findViewById(R.id.item_name);
                EditText quantityText = (EditText) findViewById(R.id.item_amount);
                EditText priceText = (EditText) findViewById(R.id.item_whole);
                String itemName = nameText.getText().toString().toLowerCase();
                String itemQuantity = quantityText.getText().toString().toLowerCase();
                String itemPrice = priceText.getText().toString().toLowerCase();
                File fileName = new File("C:\\Users\\gmbordelon\\Documents\\GitHub\\HackathonFoodTruck\\inventory.txt");
                try {
                    String newLine = itemName + " " + itemQuantity + "" + itemPrice;
                    FileWriter fileWriter = new FileWriter(fileName.getAbsoluteFile());
                    BufferedWriter buffWriter = new BufferedWriter(fileWriter);
                    buffWriter.write(newLine);
                    buffWriter.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(AddItem.this,
                        R.string.item_done,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_item, menu);
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
