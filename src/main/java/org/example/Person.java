package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String  email;
    String gender;
    double salary;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return 13 <= age && age <= 19;
    }

    public Person() {
        System.out.println("Person has been created");
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String gender, String email, double salary) {
        this(firstName, lastName, age);
        this.gender = gender;
        this.email = email;
        this.salary = salary;
    }
}
