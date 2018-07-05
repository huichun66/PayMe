package com.example.user.payme.Objects;

import java.util.ArrayList;

public class Receipt {
    private ArrayList<ReceiptItem> mItemList = new ArrayList<>();
    private String mShopname;
    private String mDate;
    private String mGstAmt;
    private String mServiceChargeAmt;
    private String mSubtotalAmt;

    public Receipt (String mShopname, String mDate, String mGstAmt, String mServiceChargeAmt, String mSubtotalAmt, ArrayList<ReceiptItem> menuList) {
        this.mShopname = mShopname;
        this.mDate = mDate;
        this.mGstAmt = mGstAmt;
        this.mServiceChargeAmt = mServiceChargeAmt;
        this.mSubtotalAmt = mSubtotalAmt;
        this.mItemList = menuList;
    }

    public ArrayList<ReceiptItem> getmItemList() {
        return mItemList;
    }

    public void setmItemList(ArrayList<ReceiptItem> mItemList) {
        this.mItemList = mItemList;
    }

    public String getmShopname() {
        return mShopname;
    }

    public void setmShopname(String mShopname) {
        this.mShopname = mShopname;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmGstAmt() {
        return mGstAmt;
    }

    public void setmGstAmt(String mGstAmt) {
        this.mGstAmt = mGstAmt;
    }

    public String getmServiceChargeAmt() {
        return mServiceChargeAmt;
    }

    public void setmServiceChargeAmt(String mServiceChargeAmt) {
        this.mServiceChargeAmt = mServiceChargeAmt;
    }

    public String getmSubtotalAmt() {
        return mSubtotalAmt;
    }

    public void setmSubtotalAmt(String mSubtotalAmt) {
        this.mSubtotalAmt = mSubtotalAmt;
    }
}