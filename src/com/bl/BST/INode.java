package com.bl.BST;

public interface INode<T extends Comparable> {
    T getKey();

    void setKey(T key);

    INode getLeft();

    void setLeft(INode<T> left);

    INode getRight();

    void setRight(INode<T> right);
}
