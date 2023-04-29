package com.bl.BST;

public class BinaryNode <T extends Comparable<T>> implements INode<T> {

    private T key;
    private BinaryNode<T> left;
    private BinaryNode<T> right;

    public BinaryNode<T> getRight(){
        return right;
    }

    public BinaryNode<T> getLeft(){
        return left;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }


    @Override
    public void setLeft(INode<T> node) {
        if(node instanceof BinaryNode) {
            this.left = (BinaryNode<T>) node;
        }
    }


    @Override
    public void setRight(INode<T> node) {
        if(node instanceof BinaryNode) {
            this.right = (BinaryNode<T>) node;
        }
    }

    public BinaryNode(T key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
