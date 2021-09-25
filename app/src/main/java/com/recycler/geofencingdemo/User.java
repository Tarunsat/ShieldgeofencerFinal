
package com.recycler.geofencingdemo;

public class User {

    public Double Lat;
    public String email;
    public Double Long;
    public Double Rad;


    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String email,Double Lat,Double Long, Double Rad) {
        this.Lat = Lat;
        this.Long= Long;
        this.Rad = Rad;
        this.email = email;
    }
}

