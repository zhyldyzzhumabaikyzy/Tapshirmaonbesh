package com.company;

public class Main {

    public static void main(String[] args) {
//	Person person = new Person();
//    person.walk();
//
//    Programmer programmer = new Programmer();
//    programmer.walk();
//
//    Dancer dancer = new Dancer();
//    dancer.walk();
//
//    Singer singer = new Singer();
//    singer.walk();

    Person[] persons = {new Programmer(), new Dancer(), new Singer()};

    for (Person person: persons) {
        person.walk();
    }


    }
}
