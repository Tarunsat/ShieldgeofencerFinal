package com.recycler.geofencingdemo;

public class Global {
    private static Global instance = new Global();

    // Getter-Setters
    public static Global getInstance() {
        return instance;
    }

    public static void setInstance(Global instance) {
        Global.instance = instance;
    }

    private double notification_index1 = 13.0524309;
    private double notification_index2 = 77.6129534;
    private double notification_index3 = 100;
    private double Currlats = 13.0524309;
    private double Currlongs = 77.6129534;
    private String Email = "";



    private Global() {

    }


    public double getValueLat() {
        return notification_index1;
    }


    public void setValueLat(double notification_index) {
        this.notification_index1 = notification_index;
    }
    public double getValueLong() {
        return notification_index2;
    }


    public void setValueLong(double notification_index) {
        this.notification_index2 = notification_index;
    }
    public double getValueRad() {
        return notification_index3;
    }


    public void setValueRad(double notification_index) {
        this.notification_index3 = notification_index;
    }
    public double getValueCurrLat() {
        return Currlats;
    }


    public void setValueCurrLat(double notification_index) {
        this.Currlats = notification_index;
    }
    public double getValueCurrLongs() {
        return Currlongs;
    }


    public void setValueCurrLong(double notification_index) {
        this.Currlongs = notification_index;
    }

    public String getValueEmail() {
        return Email;
    }


    public void setValueEmail(String notification_index) {
        this.Email = notification_index;
    }

}
