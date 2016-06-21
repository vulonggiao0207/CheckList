package com.giao.checklist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button checkListButton;
    Button checkListManagerButton;
    Button exitButton;
    MainActivity_Event event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        event = new MainActivity_Event(this);
        //Create controls
        checkListButton=(Button) findViewById(R.id.checkListButton);
        checkListManagerButton=(Button) findViewById(R.id.checkListManagerButton);
        exitButton=(Button) findViewById(R.id.exitButton);
        //Create event
        checkListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                event.checkListButton_Click();
            }
        });
        checkListManagerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                event.checkListManagerButton_Click();
            }
        });
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                event.exitbutton_Click();
            }
        });
    }
}
