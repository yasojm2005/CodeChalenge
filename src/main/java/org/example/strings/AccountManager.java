package org.example.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class AccountManager {


    public static void main(String[] args) {



        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(4);
        integers.add(6);
        integers.add(11);
        integers.add(14);
        integers.add(17);
        integers.add(19);


        System.out.println(solve(6,6,integers));
    }
    public static ArrayList<Integer> solve(int A, int B, ArrayList<Integer> C) {

        PriorityQueue<Integer> notAvailableAccounts = new    PriorityQueue<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i =0; i<C.size();i++ ){

            int ordertime = C.get(i);

            while(notAvailableAccounts.size() > 0 && notAvailableAccounts.element() <= ordertime)
            {
                notAvailableAccounts.remove();

            }



                notAvailableAccounts.add(ordertime + B);

                Integer freeAccounts = A - notAvailableAccounts.size();

                result.add(freeAccounts);



        }

        return result;
    }
    }



