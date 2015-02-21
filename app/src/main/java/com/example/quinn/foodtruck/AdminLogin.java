package com.example.quinn.foodtruck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Quinn on 2/21/2015.
 */
public class AdminLogin extends ActionBarActivity{
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        mLoginButton = (Button)findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminLogin.this, Admin.class);
                EditText editText = (EditText)findViewById(R.id.name_admin);
                EditText editText1 = (EditText) findViewById(R.id.password_admin);
                String userName = editText.getText().toString().toLowerCase();
                String password = editText1.getText().toString().toLowerCase();
                boolean flag = loginTest(userName, password);
                if (flag == true) {
                    startActivity(intent);
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
        String user = "1";
        String pass = "1";
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
