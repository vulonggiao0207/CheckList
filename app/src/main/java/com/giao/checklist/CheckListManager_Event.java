package com.giao.checklist;

import android.app.Activity;

/**
 * Created by Long on 6/21/2016.
 */
public class CheckListManager_Event {
    Activity activity;
    public CheckListManager_Event(Activity act) {
        activity=act;
    }
    public void backButton_Click()
    {
        activity.onBackPressed();
    }
    public void addCheckListButton_Click(String checkListName)
    {

    }
    public void checkListListView_ItemClick()
    {

    }
}
