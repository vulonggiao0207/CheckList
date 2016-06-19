package com.giao.checklist;

/**
 * Created by Long on 6/16/2016.
 */
public class CheckListBO {
    private String checkListName;
    public CheckListBO()
    {

    }
    public CheckListBO(String checkListName) {
        this.checkListName = checkListName;
    }

    public String getCheckListName(){return this.checkListName;}
    public void setCheckListName(String checkListName){this.checkListName=checkListName;}
}
