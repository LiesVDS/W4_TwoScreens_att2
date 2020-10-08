package com.example.android.w4_twoscreens_att2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtName = (TextView) findViewById(R.id.txtName);
        TextView txtEmail = (TextView) findViewById(R.id.txtEmail);
        TextView txtCountry = (TextView) findViewById(R.id.txtCountry);
        Button btnClose = (Button) findViewById(R.id.btnClose);

        Intent i = getIntent();
        // Receiving the Data
        String name = i.getStringExtra("name");
        String email = i.getStringExtra("email");
        String country = i.getStringExtra("country");
        Log.e("Second Screen", name + "." + email + "." + country);

        // Displaying Received data
        txtName.setText(name);
        txtEmail.setText(email);
        txtCountry.setText(country);

        // Binding Click event to Button
        btnClose.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Closing SecondScreen Activity
                finish();
            }
        });

    }
}