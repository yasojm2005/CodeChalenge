package org.example.coinchange;

/*
The Coin Change problem is a classic dynamic programming problem.
The problem statement is as follows: given an array of coin denominations and a target amount,
 find the minimum number of coins required to make up the target amount.
        */
public class CoinChange {

    public static void main(String[] args) {
        System.out.println("Coin change answer!");
        int[] coins = {1, 2, 5};
        int amount = 11;
        int[] result = new int[]{amount + 1};
        int cont = 0;
        DFSCoinChange(coins, amount, cont, result);
        System.out.println(result[0]);

    }

    private static void DFSCoinChange(int[] coins, int amount, int cont, int[] result) {
        if (amount == 0) {
            int a = Math.min(result[0], cont);
            result[0] = a;
            return;
        }
        for (int i = 0; i < coins.length && coins[i] <= amount; i++) {
            DFSCoinChange(coins, amount - coins[i], cont + 1, result);
        }

    }


}

