package com.iddamal.min.criminalintent;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

public class Crime {

    // Instance vars
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    // Getters and setters
    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDate() {
        // Returns the date object in a localised string format
        return DateFormat.getDateInstance().format(mDate);
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    // Default constructor
    public Crime() {
        // Generate unique ID
        this.mId = UUID.randomUUID();
        this.mDate = new Date();
    }
}
