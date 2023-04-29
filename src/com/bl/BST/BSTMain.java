package com.bl.BST;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();


        tree.add(56);
        tree.add(30);
        tree.add(70);


        System.out.println("Inorder Binary Search Tree");
        tree.inorder();
    }
}
