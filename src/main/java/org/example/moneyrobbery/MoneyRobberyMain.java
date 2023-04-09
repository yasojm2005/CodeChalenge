package org.example.moneyrobbery;
/*Problem Statement: You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

        Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

        Example 1:

        Input: nums = [1,2,3,1]
        Output: 4
        Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
        Total amount you can rob = 1 + 3 = 4.
        Example 2:

        Input: nums = [2,7,9,3,1]
        Output: 12
        Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
        Total amount you can rob = 2 + 9 + 1 = 12.


        */
public class MoneyRobberyMain {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //Recurrence way
    public int f(int[] nums,int i){
        if(i==0)return nums[i]; // if only single house presents
        if(i==1)return Math.max(nums[1],nums[0]); // only two houses present

        // two cases explained above...
        return Math.max(nums[i]+f(nums,i-2),f(nums,i-1));
    }

    //Functional Programming
    public int rob(int[] nums) {


        int n = nums.length;

        if(n==0) return 0; // no house.

        if(n==1) return nums[0]; // only one house.

        // if it has two or more houses...

        int dp[] = new int[n]; // dp[i] - it shows maximum amount collected till ith house.

        dp[0] = nums[0]; // only one house.

        // if we have two houses then we can rob from one house only (which has maximum amount).
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2;i<n;i++){

            // those two cases explained initially.
            dp[i] = Math.max(nums[i]+dp[i-2], dp[i-1]);

        }

        return dp[n-1];
    }

    //DFS Solution
    private int robHelper(int[] nums, int i, Integer[] memo) {
        if (i >= nums.length) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }
        int rob = nums[i] + robHelper(nums, i+2, memo);
        int skip = robHelper(nums, i+1, memo);
        memo[i] = Math.max(rob, skip);
        return memo[i];
    }
}
