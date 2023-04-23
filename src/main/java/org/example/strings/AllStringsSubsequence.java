package org.example.strings;

import java.util.ArrayList;
import java.util.List;

public class AllStringsSubsequence {
    public static void main(String[] args) {
        String str = "123";
        List<String> subsets = generateSubsets(str);
        for (String s : subsets) {
            System.out.println(s);
        }
    }


    public static List<String> generateSubsets(String str) {
        List<String> result = new ArrayList<String>();
        if (str == null || str.isEmpty()) {
            return result;
        }
        char[] chars = str.toCharArray();
        dfs(chars, 0, "", result);
        return result;
    }

    private static void dfs(char[] chars, int index, String current, List<String> result) {
        if (index == chars.length) {
            result.add(current);
            return;
        }
        dfs(chars, index+1, current + chars[index], result); // Include current char
        dfs(chars, index+1, current, result); // Exclude current char

    }


}
