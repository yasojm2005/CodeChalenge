package org.example.strings;

import java.util.ArrayList;
import java.util.List;

public class LnguestCommonSubsequence {
    public static String longestCommonSubsequence(String s1, String s2) {
        List<String> subsequences = new ArrayList<>();
        dfs(s1, s2, 0, 0, new StringBuilder(), subsequences);

        String lcs = "";
        int maxLength = 0;
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
            if (subsequence.length() > maxLength) {
                lcs = subsequence;
                maxLength = subsequence.length();
            }
        }

        return lcs;
    }

    private static void dfs(String s1, String s2, int i, int j, StringBuilder sb, List<String> subsequences) {
        if (i == s1.length() || j == s2.length()) {
            subsequences.add(sb.toString());
            return;
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            sb.append(s1.charAt(i));
            dfs(s1, s2, i + 1, j + 1, sb, subsequences);
            sb.deleteCharAt(sb.length() - 1);
        } else {
            dfs(s1, s2, i + 1, j, sb, subsequences);
            dfs(s1, s2, i, j + 1, sb, subsequences);

        }
    }

    public static void main(String[] args) {
       String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
       /* String s1 = "DCE";
        String s2 = "DEC";*/
       /* String s1 = "ABCDEF";
        String s2 = "GXTXAYB";*/

        String lcs = longestCommonSubsequence(s1, s2);
        System.out.println("Longest Common Subsequence: " + lcs);
    }
}
