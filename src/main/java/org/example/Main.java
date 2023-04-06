package org.example;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int multipleN(int [] array)
    {
        LinkedList<String>  list = new LinkedList<>();
        int sum=0;
        for (int i = 0; i < array.length ; i++) {
             if(sum % 4 == 0)
             {
                 sum+=array[i];
             }
        }

        return sum;

    }
}