package com.georgioskachrimanis.javacourse;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    //Getters and Setters
    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public int getAge () {
        return age;
    }

    public String getFullName() {

        if (firstName.isEmpty()) {
            return lastName;
        } else if(lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {

        this.age = age;

        if (age <0 || age > 100) {
            this.age = 0;
        }
    }

    public boolean isTeen() {
     return (age > 12 && age < 20);
    }


}
