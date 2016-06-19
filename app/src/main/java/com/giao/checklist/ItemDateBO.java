package com.giao.checklist;

/**
 * Created by Long on 6/19/2016.
 */
public class ItemDateBO {


    private int ckItemID;
    private String ckDate;
    private String itemNote;
    public ItemDateBO(int ckItemID, String ckDate, String itemNote) {
        this.ckItemID = ckItemID;
        this.ckDate = ckDate;
        this.itemNote = itemNote;
    }

    public ItemDateBO()
    {

    }
    public int getCkItemID() {
        return ckItemID;
    }

    public void setCkItemID(int ckItemID) {
        this.ckItemID = ckItemID;
    }
    public String getCkDate() {
        return ckDate;
    }
    public void setCkDate(String ckDate) {
        this.ckDate = ckDate;
    }
    public String getItemNote() {
        return itemNote;
    }

    public void setItemNote(String itemNote) {
        this.itemNote = itemNote;
    }

}
