package org.example.strings;

import java.util.List;

public class MinimumDistance {

    public static void main(String[] args) {

       String A = "x...o.x...o";
       System.out.println(minDistance(A));


    }

    public int solve(String A) {
        Integer min = null;
        char [] charArray = A.toCharArray();
        for(int i =0; i < charArray.length ; i++){
            for(int j = i +1; j< charArray.length;j++)
            {
                int distance = j - i;
                if(min == null || distance < min )
                {
                    min =distance;
                }

            }

        }

        if(min == null)
        {
            return -1;
        }
        return min;
    }

    public static int minDistance(String string) {
        int xIndex = -1;  // index of the last 'x' found
        int oIndex = -1;  // index of the last 'o' found
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (c == 'x') {
                xIndex = i;
                if (oIndex >= 0) {  // 'o' found before
                    minDistance = Math.min(minDistance, xIndex - oIndex);
                }
            } else if (c == 'o') {
                oIndex = i;
                if (xIndex >= 0) {  // 'x' found before
                    minDistance = Math.min(minDistance, oIndex - xIndex);
                }
            }
        }

        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
    }


}

