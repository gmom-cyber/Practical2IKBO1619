package ru.mirea.ikbo1619.lab2;

public class Main {

    public static void main(String[] args) {
        TestClass test = new TestClass();//создаем объект класса - тестора
        Shape treangle = new Shape(3,12);//создаем объекты классов
        Book book1 = new Book(456,"Pushkin");
        Ball ball1 = new Ball(16,32);
        //Тестируем
        test.test_for_Shape(treangle);
        test.test_for_Book(book1);
        test.test_for_Ball(ball1);

    }


}
