package com.georgioskachrimanis.javacourse;

public class Main {

    public static void main(String[] args) {

        Person userOne = new Person();

        userOne.setFirstName("Georgios");
        userOne.setLastName("Kachrimanis");
        userOne.setAge(44);

        System.out.println("The full name of the user is: " + userOne.getFullName() + " and he is "
        + userOne.getAge() + " old.");
        System.out.println("Is the user "+ userOne.getFirstName() + " a teen? That is " + userOne.isTeen());



    }
}
