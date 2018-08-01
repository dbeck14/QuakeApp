package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    private String mUrl;

    public Earthquake(double Magnitude, String Location, long timeinMilliseconds, String url) {
        mMagnitude = Magnitude;
        mLocation = Location;
        mTimeInMilliseconds = timeinMilliseconds;
        mUrl = url;
    }

    public double getMagnitude() {return mMagnitude;}

    public String getLocation() {return mLocation;}

    public long gettimeInMilliseconds() {return mTimeInMilliseconds;}

    public String getUrl() {return mUrl;}


}
