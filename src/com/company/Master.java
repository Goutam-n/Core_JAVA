package com.company;
import java.util.*;

import com.company.Derived;

public class Master {
    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        String str= scn.nextLine();
        int x=scn.nextInt();
        float f=scn.nextFloat();
        System.out.println("Entered string :" + str);
        System.out.println("Entered integer :" + x);
        System.out.println("Entered floatNumber :" + f);
    }
}