package com.iddamal.min.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {

    // Instance vars
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    // Constructor set to private so you have to use the get()
    // method in order to receive list of Crimes
    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        // Creating 100 crime objects
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime no. " + i);
            crime.setSolved(i % 2 == 0); // Every other crime
            mCrimes.add(crime);
        }
    }

    // Returns all crimes as List object
    public List<Crime> getAllCrimes() {
        return mCrimes;
    }

    // Returns crime of a specific ID number
    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}
