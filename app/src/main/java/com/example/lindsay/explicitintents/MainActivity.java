package com.example.lindsay.explicitintents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b= (Button)findViewById(R.id.button1);
    }

    //When the button is clicked, launch ActivityB
    public void doSomething(View v){
        //Need to specify .class on the activity being called
        //Intent i = new Intent(this, ActivityB.class);

        //To set class separately:
        Intent i = new Intent();
        //Need the full location of the activity being called
        i.setClassName("com.example.lindsay.explicitintents","com.example.lindsay.explicitintents.ActivityB");

        startActivity(i);
    }

}
