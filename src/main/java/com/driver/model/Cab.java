package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "cab")
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int perKmRate;

    private boolean available;

    public Cab(int id, int perKmRate, boolean available, Driver driver) {
        this.id = id;
        this.perKmRate = perKmRate;
        this.available = available;
        this.driver = driver;
    }

    @OneToOne
    @JoinColumn
    private Driver driver;

    public Cab() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean getAvailable()
    {
        return available;
    }

    public Driver getDriver() {
        return driver;
    }


    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}