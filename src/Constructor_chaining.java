package com.company;

//JAVA program to illustrate Constructor chaining to other class using  " super() " keyword

public class Constructor_chaining
{
    String name;
    Constructor_chaining()
    {
        // constructor 2
        this("");
        System.out.println("No-Argument Constructor of base class");
    }

    // constructor 2
    Constructor_chaining(String name)
    {
        this.name =name;
        System.out.println("Calling parametrized constructor of base class");
    }

}

class Derived extends Constructor_chaining
{
    // constructor 3
    Derived()
    {
        System.out.println("No-argument constructor " +
                "of derived");
    }

    // parameterized constructor 4
    Derived(String name)
    {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " +
                "constructor of derived");
    }
}