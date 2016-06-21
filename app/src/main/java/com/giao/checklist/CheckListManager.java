package com.giao.checklist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

/**
 * Created by Long on 6/21/2016.
 */
public class CheckListManager extends Activity {

    Button backButton;
    Button addCheckListButton;
    EditText addCheckListEditText;
    ListView checkListListView;
    CheckListManager_Event event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checklistmanager);
        event = new CheckListManager_Event(this);
        //Create controls
        backButton=(Button)findViewById(R.id.backButton);
        addCheckListButton=(Button)findViewById(R.id.addCheckListButton);
        addCheckListEditText=(EditText)findViewById(R.id.addCheckListEditText);
        checkListListView=(ListView)findViewById(R.id.checkListListView);
        //add event
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                event.backButton_Click();
            }
        });
        addCheckListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String checkListName=addCheckListEditText.getText().toString();
                event.addCheckListButton_Click(checkListName);
            }
        });
        checkListListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
