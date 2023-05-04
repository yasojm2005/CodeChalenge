package org.example.Test;

import java.util.ArrayList;

public class SumPair {
    public static void main(String[] args) {

        int[] A = {1, 2, 2, 1};
        int[] B = {2, 3, 1, 2};
        int[] C = solve(A, B);
        System.out.println(C);

    }



    public static int[] solve(int[] A, int[] B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        if(A.length < B.length)
        {
            int [] C= new int [A.length];
            int cont =0;
            for(int i=0;i< A .length; i++){
                for(int j=0;j<B.length;j++){
                    if(A[i]==B[j]){
                        C[cont]=A[i];
                        cont++;
                        break;
                    }
                }
            }

            return C;
        }
        else
        {
            int [] C= new int [B.length];
            int cont =0;
            for(int i=0;i < B .length; i++){
                for(int j=0;j<A.length;j++){
                    if(B[i]==A[j]){
                        C[cont]=B[i];
                        cont++;
                        break;
                    }
                }
            }

            return C;


        }
    }
}


