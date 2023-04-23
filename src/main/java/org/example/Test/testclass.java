package org.example.Test;

import java.util.ArrayList;
import java.util.List;

public class testclass {

    public static void main(String[] args) {

       int sum= calculateSum("Hello123");
       System.out.println(sum);
    }


    public static int calculateSum(String s)
    {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");
        list.add("n");
        list.add("o");
        list.add("p");
        list.add("q");
        list.add("r");
        list.add("s");
        list.add("t");
        list.add("u");
        list.add("v");
        list.add("w");
        list.add("x");
        list.add("y");
        list.add("z");
        char[] values = s.toCharArray();
        int sum = 0;
        int sumaux=0;
        for(char c : values)
        {

            if(Character.isDigit(c))
            {
                sum += Character.getNumericValue(c);

            }
            else {

                char lowerCase = Character.toLowerCase(c);
                int index = searchCharacter(list, String.valueOf(lowerCase));
                sumaux += index;
            }



        }
            return sum + sumaux ;
    }

    public static int searchCharacter(List<String> list, String character)
    {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(character))
            {
                return  i +1;
            }
        }

        return -1;

    }
}
