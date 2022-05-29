package com.falldetection.myapplication;

public class UsersData {
    private String userId;
    private String username;
    private String email;
    private String imageURL;
    private String gender;


    public UsersData(String userId, String username, String email, String imageURL, String gender) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.imageURL = imageURL;
        this.gender = gender;
    }
    public UsersData() {


    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
