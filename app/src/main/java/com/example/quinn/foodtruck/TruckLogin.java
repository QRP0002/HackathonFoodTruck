package com.example.quinn.foodtruck;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class TruckLogin extends ActionBarActivity {
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truck_login);

        mLoginButton = (Button)findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TruckLogin.this, Truck.class);
                EditText editText = (EditText) findViewById(R.id.name_truck);
                EditText editText1 = (EditText) findViewById(R.id.password_truck);
                String userName = editText.getText().toString().toLowerCase();
                String password = editText1.getText().toString().toLowerCase();
                boolean flag = loginTest(userName, password);
                if (flag == true) {
                    startActivity(intent);
                } else {
                    Toast.makeText(TruckLogin.this,
                            R.string.incorrect_info,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_truck_login, menu);
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

    public boolean loginTest (String userNameIn, String passIn) {
        String user = "admin";
        String pass = "password";
        boolean userFlag = false;
        boolean passFlag = false;

        if (user.equals(userNameIn)) {
            userFlag = true;
        }

        if (pass.equals(passIn)) {
            passFlag = true;
        }

        if (passFlag == true && userFlag == true) {
            return true;
        }
        return false;
    }
}
