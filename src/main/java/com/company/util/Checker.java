package com.company.util;

public class Checker {
    public boolean isEven(int number) {
        if (number%2 == 0)
            System.out.println("число " +number +" четное");
        return false;
    }

    public boolean isOdd(int number) {
        if (number%2 !=0 || number ==1 )
            System.out.println("число " +number +" нечетное");
        return true;
    }
}
