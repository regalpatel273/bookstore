package com.regal.bookstore.model;

public class Author {
    private int id;
    private String name;
    private String profilePicUrl;
    private String description;

    public Author(int id, String name, String profilePicUrl, String description) {
        this.id = id;
        this.name = name;
        this.profilePicUrl = profilePicUrl;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
