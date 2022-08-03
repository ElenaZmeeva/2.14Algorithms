package com.example2.Algorithms;

import java.util.Objects;

public class StringListImpl implements StringListInterface {
    private static final int INITIAL_SIZE=15;

    private final String[] list;
    private int capacity;

    public StringListImpl(){
        list=new String[INITIAL_SIZE];
    }


    @Override
    public String add(String item) {
if (Objects.isNull(item)){
    throw new IllegalArgumentException("We cant add null");
}
if (capacity >=list.length){
   throw new IllegalArgumentException("List is full");
}
list[capacity++]= item;
        return item;
    }

    @Override
    public String add(int index, String item) {
        if (capacity >=list.length){
            throw new IllegalArgumentException("List is full");
        }
        if (Objects.isNull(item)){
            throw new IllegalArgumentException("We cant add null");
        }
        if(index<0){
            throw new IllegalArgumentException("Index cannot be negative");
        }
        if(index> capacity){
            throw new IllegalArgumentException("Index: "+ index+ "size: " + capacity);
        }
        System.arraycopy(list, index, list, index + 1, capacity - index);
        capacity++;
        return list[index]=item;
    }

    @Override
    public String set(int index, String item) {

        if (Objects.isNull(item)){
            throw new IllegalArgumentException("We cant add null");
        }
        if(index<0){
            throw new IllegalArgumentException("Index cannot be negative");
        }
        if(index> capacity){
            throw new IllegalArgumentException("Index: "+ index+ "size: " + capacity);
        }
        return list[index]=item ;
    }

    @Override
    public String remove(String item) {

        if (Objects.isNull(item)){
            throw new IllegalArgumentException("We cant add null");
        }
        int indexForRemove=-1;
        for (int i = 0; i < capacity; i++) {
            if (list[i].equals(item)) {
                indexForRemove = i;
                break;
            }
        }
            if (indexForRemove==-1){
                throw new IllegalArgumentException("Element not found");
            }
        return remove(indexForRemove);
    }

    @Override
    public String remove(int index) {
        if(index<0){
            throw new IllegalArgumentException("Index cannot be negative");
        }
        if(index>= capacity){
            throw new IllegalArgumentException("Index: "+ index+ "size: " + capacity);
        }
        String removed = list[index];
        if (capacity - 1 - index >= 0) System.arraycopy(list, index + 1, list, index, capacity - 1 - index);
        list[--capacity]=null;
        return removed;
    }

    @Override
    public boolean contains(String item) {
        if (Objects.isNull(item)){
            throw new IllegalArgumentException("We cant add null");
        }
        for (int i = 0; i < capacity; i++) {
            if(list[i].equals(item)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        if (Objects.isNull(item)){
            throw new IllegalArgumentException("We cant add null");
        }
        int index=-1;
        for (int i = 0; i < capacity; i++) {
            if(list[i].equals(item)){
                index=i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(String item) {
        if (Objects.isNull(item)){
            throw new IllegalArgumentException("We cant add null");
        }
        int index=-1;
        for (int i = capacity-1; i >=0 ; i--) {
            if(list[i].equals(item)){
                index=i;
                break;
            }
        }
        return index;
    }


    @Override
    public String get(int index) {
        if(index<0){
            throw new IllegalArgumentException("Index cannot be negative");
        }
        if(index>= capacity){
            throw new IllegalArgumentException("Index: "+ index+ "size: " + capacity);
        }
        return list[index];
    }

    @Override
    public boolean equals(StringListInterface otherList) {
        if(size()!= otherList.size()){
            return false;
        }
        for (int i = 0; i < capacity; i++) {
            if(!list[i].equals(otherList.get(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return capacity;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            list[i]=null;
        }
        capacity=0;
    }

    @Override
    public String[] toArray() {
        String[] result= new String[capacity];
        System.arraycopy(list, 0, result, 0, capacity);
        return result;
    }
}
