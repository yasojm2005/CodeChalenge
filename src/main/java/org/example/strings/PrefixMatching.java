package org.example.strings;

import java.util.*;

public class PrefixMatching {


    public static void main(String[] args) {
       /* A : [ "aa", "aaab", "ab", "b" ]
        B : "b"*/
       /* A : [ "aaa", "aaa", "aaab", "b", "bab", "bbaa", "bbaaa", "bbbb", "bbbbb" ]
        B : "aaa"*/

        ArrayList<String> A = new ArrayList<>();
        A.add("aaa");
        A.add("aaa");
        A.add("aaab");
        A.add("b");
        A.add("bab");
        A.add("bbaa");
        A.add("bbaaa");
        A.add("bbbb");
        A.add("bbbb");
        String B = "aaa";
        System.out.println(solve( A, B));


    }


    public static ArrayList<Integer> solve(ArrayList<String> A, String B) {



        final int[] cont = {0};
        List<Integer> result = new ArrayList();
        List<Integer> result1 = new ArrayList();
        List<Integer> allPrefix = new ArrayList();
        result1.add(-1);
        result1.add(-1);


        A.stream().forEach(s->{


            if(s.startsWith(B) )
            {

                allPrefix.add(cont[0]);

            }

            cont[0]++;



        });


        if(allPrefix.size()== 0)
        {

            return (ArrayList<Integer>) result1;
        }
        if(allPrefix.size()== 1)
        {
            result.add(allPrefix.get(0));
            result.add(allPrefix.get(0));
            return (ArrayList<Integer>) result;

        }
        if(allPrefix.size()> 1)
        {
            result.add(allPrefix.get(0));
            result.add(allPrefix.get(allPrefix.size()- 1));

        }


        return (ArrayList<Integer>) result;

    }
    }





