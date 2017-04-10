package com.kumar.akshay.familylocator;

/**
 * Created by Akshay Kumar on 06-04-2017.
 */

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by lmoroney on 12/17/14.
 */
public final class Constants {

    private Constants() {
    }

    public static final String PACKAGE_NAME = "com.example.akshaykumar.geofencingapp";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 24*30;

    public static final int NUMBER_OF_LANDMARKS = 6;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    //public static final float GEOFENCE_RADIUS_IN_METERS = 50; // 1 mile, 1.6 km
    public static final float GEOFENCE_RADIUS_IN_METERS = 200; // 1 mile, 1.6 km

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    public static final HashMap<String, LatLng> LANDMARKS = new HashMap<String, LatLng>();
    static {
        // Unit 55 AR
        LANDMARKS.put("Unit", new LatLng(29.126852, 75.826400));

        // Home
        LANDMARKS.put("Home", new LatLng(29.114783, 75.842385));

        // Hisar, India
        LANDMARKS.put("Hisar Phwara Chowk", new LatLng(29.148608, 75.722262));

        //Hansi, India
        LANDMARKS.put("Hansi Bus Stand", new LatLng(29.093870, 75.964670));

        //Village Badli, Haryana, India
        LANDMARKS.put("Badli", new LatLng(28.574488, 76.811289));

        //College PPIMT
        LANDMARKS.put("PPIMT", new LatLng(29.024247, 75.618098));

        //APS Hisar
        LANDMARKS.put("APS Hisar", new LatLng(29.114289, 75.830858));

        //TCP-2 Hisar Cantt
        LANDMARKS.put("TCP -2 Hisar", new LatLng(29.114131, 75.817686));

        //Jindal Chowk Hisar
        LANDMARKS.put("Jindal Chowk Hisar", new LatLng(29.134647, 75.747422));

        //Dabra Chowk, Hisar
        LANDMARKS.put("Dabra Chowk", new LatLng(29.138739, 75.736698));

        //Muklan Hisar
        LANDMARKS.put("Muklan Hisar", new LatLng(29.068994, 75.658859));

        //Cheetal Complex
        LANDMARKS.put("Cheetal Complex", new LatLng(29.108752, 75.849437));

    }

}