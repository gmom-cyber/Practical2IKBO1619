package ru.mirea.ikbo1619.lab2;

public class Shape {
    private int number_of_sides, lengt_of_Shape;
    public Shape(int number_of_sides, int lengt_of_Shape)
    {
        this.number_of_sides = number_of_sides;
        this.lengt_of_Shape = lengt_of_Shape;
    }

    //@Override
    public String toString() {
        return "Shape{" +
                "number_of_sides=" + number_of_sides +
                ", lengt_of_Shape=" + lengt_of_Shape +
                '}';
    }
}
