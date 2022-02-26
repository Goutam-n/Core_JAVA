package com.company;
// JAVA program to illustrate constructor overloading by using same task for differrent types of argument
class Construct
{
    // Constructor with one argument
    Construct(String name)
    {
        System.out.println("Constructor with one "+ "argument - string : "+ name);
    }
    // Constructor with two argument
    Construct(String name, int age)
    {
        System.out.println("Constructor with two argument "+ "string and integer : "+ name+ " "+ age );
    }
    // Constructor with one argument ( BUT WITH DIFFERENT TYPE THAN PREVIOUS )
    Construct(long id)
    {
        System.out.println("Constructor with one argument "+ "long : "+ id);
    }
}
