package com.example.bellsprout.model;

import java.util.Date;

public class GardenPlant {
    private long id;
    private long plantId;
    private long roomId;
    private String name;
    private String notes;
    private String picture;
    private int wateringDaysInterval;
    private Date lastWateredDate;

    public GardenPlant() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPlantId() {
        return plantId;
    }

    public void setPlantId(long plantId) {
        this.plantId = plantId;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getWateringDaysInterval() {
        return wateringDaysInterval;
    }

    public void setWateringDaysInterval(int wateringDaysInterval) {
        this.wateringDaysInterval = wateringDaysInterval;
    }

    public Date getLastWateredDate() {
        return lastWateredDate;
    }

    public void setLastWateredDate(Date lastWateredDate) {
        this.lastWateredDate = lastWateredDate;
    }
}
