package com.example.newassignment3;

import android.location.Location;

import java.security.KeyStore;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class meetingItem {
    private String meetingName;
    private int importanceLvl;
    private ArrayList<String> attendees;
    private int meetingTime;
    private int meetingDate;
    private String meetingLoc;

    public meetingItem (String mName, int imprtLvl, ArrayList<String> AttendeeList, int mTime, int mDate, String mLoc){
        meetingName = mName;
        importanceLvl = imprtLvl;
        attendees = AttendeeList;
        meetingTime = mTime;
        meetingDate = mDate;
        meetingLoc = mLoc;
    }

    public String getMName(){
        return meetingName;
    }

    public int getImportanceLvl(){
        return importanceLvl;
    }

    public ArrayList<String> getAttendees(){
        return attendees;
    }

    public int getMeetingTime(){
        return meetingTime;
    }

    public int getMeetingDate(){
        return meetingDate;
    }

    public String getMeetingLoc(){
        return meetingLoc;
    }
}


