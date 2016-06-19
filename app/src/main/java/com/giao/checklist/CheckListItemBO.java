package com.giao.checklist;

/**
 * Created by Long on 6/16/2016.
 */
public class CheckListItemBO {
    private int ckItemID;
    private String checkListName;
    private String ckItemName;
    public CheckListItemBO()
    {

    }

    public CheckListItemBO(int ckItemID, String checkListName, String ckItemName) {
        this.ckItemID = ckItemID;
        this.checkListName = checkListName;
        this.ckItemName = ckItemName;
    }

    public int getCkItemID() { return ckItemID; }
    public void setCkItemID(int ckItemID){this.ckItemID=ckItemID;}
    public String getCheckListName(){return this.checkListName;}
    public void setCheckListName(String checkListName){this.checkListName=checkListName;}
    public String getckItemName(){return this.ckItemName;}
    public void setckItemName(String ckItemName){this.ckItemName=ckItemName;}
}
