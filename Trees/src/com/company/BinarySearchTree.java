package com.company;

import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> implements BinarySearchTreeBase<T> {
    private TreeNode<T> root;
    private int size;
    BinarySearchTree(){
        root=null;
        size = 0;
    }

    @Override
    public void add(T value) {
        TreeNode<T> node= new TreeNode<>(value);

        if(root==null){
            root = node;
            return;
        }

        TreeNode<T> current = root;

        while(true){
            if (node.value.compareTo(current.value)<0){
                    current = current.left;

            }
            else{
                current = current.right;
            }
        }
    }

    @Override
    public void remove(T value) {

    }

    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    class TreeNode<T>{
        T value;
        TreeNode<T> left;
        TreeNode<T> right;

        public TreeNode(T value){
            this.value = value;
        }


    }
}
