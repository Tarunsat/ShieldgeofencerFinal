package com.recycler.geofencingdemo;

public class ImageUploadInfo {

    public String Name;
    public String Password;

    public String imageURL;

    public ImageUploadInfo() {

    }

    public ImageUploadInfo(String name,String Pass, String url) {

        this.Password=Pass;
        this.Name = name;
        this.imageURL= url;
    }

    public String getName() {
        return Name;
    }
    public String getPassword() {
        return Password;
    }

    public String getImageURL() {
        return imageURL;
    }

}

