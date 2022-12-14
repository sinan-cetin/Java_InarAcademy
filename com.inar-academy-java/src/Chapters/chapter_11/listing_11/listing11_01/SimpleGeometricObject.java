package Chapters.chapter_11.listing_11.listing11_01;

import java.util.Date;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /**
     * Construct a default geometric object
     */
    public SimpleGeometricObject() {
        this.dateCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with the specified color
     * and filled value
     */
    public SimpleGeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new java.util.Date();
    }


    /**
     * Return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on " + this.dateCreated +"\ncolor: " + this.color + " and filled: " + filled;
    }
}
