package com.company;

import com.company.Derived;

public class Master {
    public static void main(String[] args) {

        com.company.Student[] arr = new com.company.Student[5];
        arr[0] = new com.company.Student(1,"abhi");
        arr[1] = new com.company.Student(2,"sufi");;
        arr[2] = new com.company.Student(3,"mufi");;
        arr[3] = new com.company.Student(4,"suhi");;
        arr[4] = new com.company.Student(5,"petie");;

        for(int i=0;i< arr.length;i++)
        {
            System.out.println("Element at : "+ i + " is : "+ arr[i].roll_no + "," + arr[i].name);
        }

    }
}