package com.company;

//JAVA program to illustrate Constructor chaining within the same class using  " this() " keyword

public class Constructor_chaining
{
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    Constructor_chaining()
    {
        // calls constructor 2
        this(5);
        System.out.println("Default Constructor");
    }

    // parameterized constructor 2
    Constructor_chaining(int x)
    {
        // calls constructor 3
        this(6,10);
        System.out.println(x);
    }

    // parameterized constructor 3
    Constructor_chaining(int x,int y)
    {
        System.out.println(x*y);
    }
}
