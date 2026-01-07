package com.example.petshop;

import java.util.Date;

// Lab exercise
public abstract class Mood {
    private Date date;

    // Default date
    public Mood() {
        this.date = new Date();
    }

    // Custom date
    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String express();
}
