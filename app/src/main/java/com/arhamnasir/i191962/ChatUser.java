package com.arhamnasir.i191962;

public class ChatUser {
    private String username;
    private int profileImage;

    public ChatUser(String username, int profileImage) {
        this.username = username;
        this.profileImage = profileImage;
    }

    public String getUsername() {
        return username;
    }

    public int getProfileImage() {
        return profileImage;
    }
}
