package com.bl.BST;
public class BinarySearchTree<T extends Comparable<T>> {
    private INode<T> root;

    public void addNode(T key) {
        INode<T> newNode = new BinaryNode<>(key);
        if (root == null) {
            root = newNode;
        } else {
            INode<T> current = root;
            INode<T> parent;
            while (true) {
                parent = current;
                if (key.compareTo(current.getKey()) < 0) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                        break;
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                        break;
                    }
                }
            }
        }
    }

    public int getSize() {
        return getSizeRecursive(root);
    }

    private int getSizeRecursive(INode<T> node) {
        if (node == null) {
            return 0;
        }
        return 1 + getSizeRecursive(node.getLeft()) + getSizeRecursive(node.getRight());
    }


}
