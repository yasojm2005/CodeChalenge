package org.example.strings;

public class StringPermutationDFS {

    public static void dfsPermutations(String str, String permutation, boolean[] visited) {
        if (permutation.length() == str.length()) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfsPermutations(str, permutation + str.charAt(i), visited);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        boolean[] visited = new boolean[str.length()];
        dfsPermutations(str, "", visited);
    }
}
