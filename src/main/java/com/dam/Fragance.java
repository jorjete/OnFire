package com.dam;

public class Fragance {
    private String name;
    private String ID;
    private String description;

    public Fragance(String name, String ID, String description) {
        this.name = name;
        this.ID = ID;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
