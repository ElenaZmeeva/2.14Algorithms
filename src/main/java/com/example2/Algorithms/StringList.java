package com.example2.Algorithms;

import java.util.Objects;

public class StringList {
    private String item;
    private int index;

    public StringList(String item, int index) {
        this.item = item;
        this.index = index;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringList that = (StringList) o;
        return index == that.index && item.equals(that.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, index);
    }

    @Override
    public String toString() {
        return "StringList{" +
                "item='" + item + '\'' +
                ", index=" + index +
                '}';
    }
}
