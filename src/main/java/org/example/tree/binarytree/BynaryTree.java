package org.example.tree.binarytree;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // Method to perform DFS traversal in pre-order
    public void DFSpreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.key + " ");
        DFSpreorder(node.left);
        DFSpreorder(node.right);
    }

    // Method to perform DFS traversal in post-order
    public void DFSpostorder(Node node) {
        if (node == null)
            return;

        DFSpostorder(node.left);
        DFSpostorder(node.right);
        System.out.print(node.key + " ");
    }

    // Method to perform DFS traversal in in-order
    public void DFSinorder(Node node) {
        if (node == null)
            return;

        DFSinorder(node.left);
        System.out.print(node.key + " ");
        DFSinorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Create a binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right= new Node(7);

        // Print the binary tree in different DFS orders
        System.out.println("Pre-order DFS traversal:");
        tree.DFSpreorder(tree.root);

        System.out.println("\nPost-order DFS traversal:");
        tree.DFSpostorder(tree.root);

        System.out.println("\nIn-order DFS traversal:");
        tree.DFSinorder(tree.root);
    }
}
