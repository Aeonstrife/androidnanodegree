package com.example.jeoffer.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowId;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void displayMessage(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        Button myButton = (Button) view;
        CharSequence appname = myButton.getText();
        //CharSequence message = "This button will launch my ".concat(appname.toString());
        String message = getResources().getString(R.string.DisplayMessage).concat(myButton.getText().toString());
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}