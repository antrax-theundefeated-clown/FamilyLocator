package com.kumar.akshay.familylocator;

/**
 * Created by Akshay Kumar on 09-04-2017.
 */

public class LocationMessage {

    private String currentLocation;
    private String time, user;

    public LocationMessage() {
    }

    public LocationMessage(String user, String currentLocation, String time) {
        this.currentLocation = currentLocation;
        this.time = time;
        this.user = user;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String text) {
        this.currentLocation = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String longitude) {
        this.time = longitude;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
