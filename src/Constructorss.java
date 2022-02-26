package com.company;

class Construct
{
    String name;
    Construct(String name)
    {
        System.out.println("Constructor with one "+ "argument - string : "+ name);
    }
    Construct(String name, int age)
    {
        System.out.println("Constructor with two argument "+ "string and integer : "+ name+ " "+ age );
    }
    Construct(long id)
    {
        System.out.println("Constructor with one argument "+ "long : "+ id);
    }
}
