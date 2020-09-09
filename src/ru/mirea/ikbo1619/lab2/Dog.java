package ru.mirea.ikbo1619.lab2;

import java.lang.*;
public class Dog {
    private String name;
    private int age;
    //Конструкторы
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Dog(String n){
        name = n;
        age = 0;

    }
    public Dog(){
        name = "NoName";
        age = 0;
    }
    //setter позволяющий установить значение поля age
    public void setAge(int age) {
        this.age = age;
    }
    //setter позволяющий установить значение поля name
    public void setName(String name) {
        this.name = name;
    }
    //getter позволяющий получить значение поля name
    public String getName(String name){
        return name;
    }
    //getter позволяющий получить значение поля age
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void intoHumanAge(){//метод перевода возраста собаки в "человеческий"
        System.out.println("Собаке по кличке \""+name+"\" "+age*7+" годиков в человеческом эквиваленте");
    }
}
