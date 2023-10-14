package com.example.bellsprout.model;

import java.util.ArrayList;
import java.util.List;

public class Plant {
    private long id;
    private String name;
    private String description;
    private int wateringDaysInterval;
    private String picture;
    private List<String> externalLinks;

    public Plant() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWateringDaysInterval() {
        return wateringDaysInterval;
    }

    public void setWateringDaysInterval(int wateringDaysInterval) {
        this.wateringDaysInterval = wateringDaysInterval;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<String> getExternalLinks() {
        return externalLinks = externalLinks == null ? new ArrayList<>() : externalLinks;
    }

    public void setExternalLinks(List<String> externalLinks) {
        this.externalLinks = externalLinks;
    }
}
