package com.timeline.felix.timeline;

/**
 * Created by media on 21.05.2018.
 */

public class CSlide {

    private int seconds;
    private String titel;
    private String description;
    private int GUID;

    public CSlide(int seconds, String titel, String description) {
        this.seconds = seconds;
        this.titel = titel;
        this.description = description;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
