package com.giao.checklist;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by Long on 6/13/2016.
 */
public class MainActivity_Event {
    Activity activity;
    public MainActivity_Event(Activity act)
    {
        activity=act;
    }
    public void checkListButton_Click()
    {
        Intent intent = new Intent(activity.getApplicationContext(),CheckList.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.getApplicationContext().startActivity(intent);
    }
    public void checkListManagerButton_Click()
    {
        Intent intent = new Intent(activity.getApplicationContext(),CheckListManager.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.getApplicationContext().startActivity(intent);
    }
    public void exitbutton_Click()
    {
        activity.onBackPressed();
    }

}
