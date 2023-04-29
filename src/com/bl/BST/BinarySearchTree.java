package com.bl.BST;

public class BinarySearchTree<T extends Comparable<T>>{
    class INode{
        T key;
        INode left, right;

        public INode(T key){
            this.key = key;
            left = right = null;
        }
    }
    INode root;
    public BinarySearchTree(){
        root = null;
    }

    public void add(T key){
        root = addRecursive(root, key);
    }

    private INode addRecursive(INode current, T key){
        if (current == null){
            return new INode(key);
        }

        if (key.compareTo(current.key) < 0){
            current.left = addRecursive(current.left, key);
        }else if (key.compareTo(current.key)>0) {
            current.right = addRecursive(current.right, key);
        }
        return current;
    }

    //Method to print BST inorder

    public void inorder(){
        inorderRecursive(root);
    }

    private void inorderRecursive(INode current){
        if (current != null){
            inorderRecursive(current.left);
            System.out.print(current.key + " ");
            inorderRecursive(current.right);
        }
    }
}
