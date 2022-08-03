package com.example2.Algorithms;

import java.util.Objects;

public class IntegerListImpl implements IntegerList{
    private static final int INITIAL_SIZE=15;

    private final Integer[] list;
    private int capacity;

    public IntegerListImpl(){
        list=new Integer[INITIAL_SIZE];
    }


    @Override
    public Integer add(Integer item) {
        if (Objects.isNull(item)){
            throw new NullException();
        }
        if (capacity >=list.length){
            throw new StorageIsFullException();
        }
        list[capacity++]= item;
        return item;
    }

    @Override
    public Integer add(int index, Integer item) {
        if (capacity >=list.length){
            throw new StorageIsFullException();
        }
        if (Objects.isNull(item)){
            throw new NullException();
        }
        if(index<0){
            throw new NegativeException();
        }
        if(index> capacity){
            throw new IllegalArgumentException("Index: "+ index+ "size: " + capacity);
        }
        System.arraycopy(list, index, list, index + 1, capacity - index);
        capacity++;
        return list[index]=item;
    }

    @Override
    public Integer set(int index, Integer item) {

        if (Objects.isNull(item)){
            throw new NullException();
        }
        if(index<0){
            throw new NegativeException();
        }
        if(index> capacity){
            throw new IllegalArgumentException("Index: "+ index+ "size: " + capacity);
        }
        return list[index]=item ;
    }

    @Override
    public Integer remove(Integer item) {

        if (Objects.isNull(item)){
            throw new NullException();
        }
        int indexForRemove=-1;
        for (int i = 0; i < capacity; i++) {
            if (list[i].equals(item)) {
                indexForRemove = i;
                break;
            }
        }
        if (indexForRemove==-1){
            throw new ElementNotFound();
        }
        return remove(indexForRemove);
    }

    @Override
    public Integer remove(int index) {
        if(index<0){
            throw new NegativeException();
        }
        if(index>= capacity){
            throw new IllegalArgumentException("Index: "+ index+ "size: " + capacity);
        }
        Integer removed = list[index];
        if (capacity - 1 - index >= 0) System.arraycopy(list, index + 1, list, index, capacity - 1 - index);
        list[--capacity]=null;
        return removed;
    }

    @Override
    public boolean contains(Integer item) {
        if (Objects.isNull(item)){
            throw new NullException();
        }
        sort();
        int min = 0;
        int max = capacity - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (item.equals(list[mid])) {
                return true;
            }

            if (item < list[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }


    @Override
    public int indexOf(Integer item) {
        if (Objects.isNull(item)){
            throw new NullException();
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
    public int lastIndexOf(Integer item) {
        if (Objects.isNull(item)){
            throw new NullException();
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
    public Integer get(int index) {
        if(index<0){
            throw new NegativeException();
        }
        if(index>= capacity){
            throw new IllegalArgumentException("Index: "+ index+ "size: " + capacity);
        }
        return list[index];
    }

    @Override
    public boolean equals(IntegerList otherList) {
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
    public Integer[] toArray() {
        Integer[] result= new Integer[capacity];
        System.arraycopy(list, 0, result, 0, capacity);
        return result;
    }
@Override
public void sort() {
        for (int i = 1; i < capacity; i++) {
            int temp = list[i];
            int j = i;
            while (j > 0 && list[j - 1] >= temp) {
                list[j] = list[j - 1];

            }
            list[j] = temp;
        }
    }


}


