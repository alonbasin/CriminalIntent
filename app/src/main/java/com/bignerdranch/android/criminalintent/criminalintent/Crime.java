package com.bignerdranch.android.criminalintent.criminalintent;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
//    private Calendar mCalendar = Calendar.getInstance();

//    int mHour = mCalendar.get(Calendar.HOUR_OF_DAY);
//    int mMinute = mCalendar.get(Calendar.MINUTE);

    public Crime() {
        mId = UUID.randomUUID();
        mDate = Calendar.getInstance().getTime();
        //mDate = new Date();
    }

    @Override
    public String toString() {
        return mTitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {
        return mId;
    }

    public Date getDate() {
        return mDate;
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

    public String formatDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMM d, yyyy");
        String formatDate = sdf.format(mDate);
        return formatDate;
    }

    public String formatTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("H:mm");
        String formatTime = sdf.format(mDate);
        return formatTime;
    }

}