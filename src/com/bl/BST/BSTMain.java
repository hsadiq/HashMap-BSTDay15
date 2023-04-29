package com.bl.BST;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.addNode(56);
        tree.addNode(30);
        tree.addNode(70);
        tree.addNode(22);
        tree.addNode(40);
        tree.addNode(11);
        tree.addNode(3);
        tree.addNode(16);
        tree.addNode(60);
        tree.addNode(95);
        tree.addNode(63);
        tree.addNode(67);

        System.out.println("Size of binary tree: " + tree.getSize());
    }
}