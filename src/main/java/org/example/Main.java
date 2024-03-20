package org.example;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Oğuz", "Samsa", 30);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("Lastname: " + person1.getLastName());
        System.out.println("Age: "+ person1.getAge());

        System.out.println("*************************************************");

        Person person2 = new Person("Ali", "Veli", 25, "erkek", "aliveli@ali.veli", 50000);
        System.out.println(person2.getFirstName() + " " + person2.getLastName() + ", " + person2.getAge() + " yaşında, " + person2.gender + ", " + person2.salary + "TL maaş alıyor. E-mail adresi: " + person2.email );

        System.out.println("*************************************************");

        Wall wall = new Wall(5,4);
        System.out.println("Area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("Width= " + wall.getWidth());
        System.out.println("Height= " + wall.getHeight());
        System.out.println("Area= " + wall.getArea());



    }
}
