package ru.mirea.ikbo1619.lab2;

public class Ball {
    private int diameter, volume;
    public Ball(int diameter, int volume) {
        this.diameter = diameter;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "diameter=" + diameter +
                ", volume=" + volume +
                '}';
    }
}
