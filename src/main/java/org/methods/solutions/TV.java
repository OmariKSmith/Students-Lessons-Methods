package org.methods.solutions;

//!                             Declare the appropriate accessor and mutator
//!                             methods for this class. Output literal values to console.
class TV {
    boolean isOn = true;
    int volume = 10;
    int channel = 5;
    boolean wifiEnabled = false;

    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println(tv.isOn() + " " + tv.getVolume() + " " + tv.getChannel()+ " " + tv.isWifiEnabled());
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public boolean isWifiEnabled() {
        return wifiEnabled;
    }

    public void setWifiEnabled(boolean wifiEnabled) {
        this.wifiEnabled = wifiEnabled;
    }
}
