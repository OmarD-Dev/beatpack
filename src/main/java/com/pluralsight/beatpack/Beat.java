package com.pluralsight.beatpack;

public class Beat {
    private double length;
    private String name;
    public Beat() {
    }
    public Beat(double length, String name) {
        this.length = length;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Beat{" +
                "length=" + length +
                ", name='" + name + '\'' +
                '}';
    }
}
