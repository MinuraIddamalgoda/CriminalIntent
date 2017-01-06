package com.iddamal.min.criminalintent;

import java.util.UUID;

public class Crime {

    // Instance vars
    private UUID mId;
    private String mTitle;

    // Getters and setters
    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    // Default constructor
    public Crime() {
        // Generate unique ID
        this.mId = UUID.randomUUID();
    }
}
