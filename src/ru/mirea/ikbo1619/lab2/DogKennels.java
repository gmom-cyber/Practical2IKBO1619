package ru.mirea.ikbo1619.lab2;
import java.util.ArrayList;
public class DogKennels {

    public static void main(String[] args) {
        ArrayList<Dog> sobaki = new ArrayList<>(5);//Динамический массив в который можно записать экзепляры класса Dog

        Dog d1 = new Dog("Бобик", 3);//Создание объекта класса Dog
        Dog d2 = new Dog("Шарик", 1);
        Dog d3 = new Dog("Чарли");
        d3.setAge(6);
        sobaki.add(d1);//Добавление объекта в массив
        sobaki.add(d2);
        sobaki.add(d3);
        //Тестирование класса
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }

}
