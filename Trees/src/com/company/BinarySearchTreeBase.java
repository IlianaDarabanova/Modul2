package com.company;

public interface BinarySearchTreeBase<T> {

    void add(T value);
    void remove(T value);
    boolean contains(T value);
    int size();
    boolean isEmpty();


}
