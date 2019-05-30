package com.example.listactivity.model;

public class Item {
    String title;
    String Description;
    String Image;

    public Item(String title, String description, String image) {
        this.title = title;
        this.Description = description;
        this.Image = image;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {

        this.Description = description;
    }

    public String getImage() {

        return Image;
    }

    public void setImage(String image) {

        this.Image = image;
    }
}
