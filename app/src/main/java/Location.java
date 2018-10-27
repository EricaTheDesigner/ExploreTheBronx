/**
 * {@link Location} represents a location in the Bronx to visit
 * It contains a Location Name, a Location Description, and an image for that location.
 */

public class Location {

    //Line one Default translation for the word
    private String mLocationName;

    //Line two Miwok translation for the word
    private String mLocationDescription;

    //Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represent no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word Object
     *
     * @param LocationName        is the location name
     * @param LocationDescription is a description of the location
     */

    //constructor name has to match Class "Location"
    public Location(String LocationName, String LocationDescription, Integer imageResourceId) {
        mLocationName = LocationName;
        mLocationDescription = LocationDescription;
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