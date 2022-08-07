package com.example2.Algorithms;

public interface StringListInterface {
    String add( String item);
    String add(int index, String item);
    String set(int index, String item);
    String remove(String item);
    String remove(int index);
    boolean contains (String item);
    int indexOf (String item);
    int lastIndexOf (String item);
    String get(int index);
    boolean equals (StringListInterface otherList);
    int size();
    boolean isEmpty();
    void clear();
    String[] toArray();

}
