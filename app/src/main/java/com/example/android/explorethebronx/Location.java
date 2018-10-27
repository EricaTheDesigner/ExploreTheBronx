package com.example.android.explorethebronx;

/**
 * {@link Location} represents a location in the Bronx to visit
 * It contains a Location Name, a Location Description, and an image for that location.
 */

public class Location {

    //Line one name of the location
    private String mLocationName;

    //Line two description for the location
    private String mLocationDescription;

    //Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represent no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Location Object
     *
     * @param locationName is the location name
     * @param locationDescription is a description of the location
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */

    //constructor name has to match Class "Location"
    public Location(String locationName, String locationDescription, Integer imageResourceId) {
        mLocationName = locationName;
        mLocationDescription = locationDescription;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the location name
     */
    public String getLocationName() {
        return mLocationName;
    }

    /**
     * Get the description of the location
     */
    public String getLocationDescription() {
        return mLocationDescription;
    }

    /**
     * Return the image resource ID of the location
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this location
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}