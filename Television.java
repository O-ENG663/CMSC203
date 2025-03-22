package LAB6;

/**
 * The purpose of this class is to model a television
 * Ange Stephy Ongoue Wetomdie, Today's Date
 */
public class Television {
    // Constants for manufacturer and screen size
    private final String MANUFACTURER; // Brand name of the TV
    private final int SCREEN_SIZE; // Size of the TV screen in inches

    // Other attributes
    private boolean powerOn; // True if TV is on, false if off
    private int channel; // Current channel of the TV
    private int volume; // Volume level of the TV

    /**
     * Constructor that initializes the TV with the given manufacturer and screen size.
     * Sets default values: power off, volume 20, and channel 2.
     * 
     * @param brand The manufacturer of the TV.
     * @param size The screen size of the TV.
     */
    public Television(String brand, int size) {
        this.MANUFACTURER = brand;
        this.SCREEN_SIZE = size;
        this.powerOn = false; // Default power state is OFF
        this.volume = 20; // Default volume
        this.channel = 2; // Default channel
    }

    /**
     * Returns the current volume of the TV.
     * @return volume level
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Returns the current channel of the TV.
     * @return current channel
     */
    public int getChannel() {
        return channel;
    }

    /**
     * Returns the manufacturer of the TV.
     * @return TV manufacturer
     */
    public String getManufacturer() {
        return MANUFACTURER;
    }

    /**
     * Returns the screen size of the TV.
     * @return TV screen size
     */
    public int getScreenSize() {
        return SCREEN_SIZE;
    }

    /**
     * Sets the TV to a specific channel.
     * @param station The channel number to set
     */
    public void setChannel(int station) {
        this.channel = station;
    }

    /**
     * Toggles the power state of the TV.
     */
    public void power() {
        powerOn = !powerOn;
    }

    /**
     * Increases the volume by 1.
     */
    public void increaseVolume() {
        volume++;
    }

    /**
     * Decreases the volume by 1.
     */
    public void decreaseVolume() {
        volume--;
    }
}