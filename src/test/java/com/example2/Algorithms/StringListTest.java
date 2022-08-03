package com.example2.Algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringListTest {


    private final StringListInterface out = new StringListImpl ();

    @Test
    public void shouldAddString(){
        String result = out.add("one");
        Assertions.assertThat(out.add("one")).isEqualTo(result);
    }

    @Test
    public void shouldAddWithIndex(){
        String result = out.add(0, "one");
        Assertions.assertThat(out.add(0,"one")).isEqualTo(result);
    }

    @Test
    public void shouldRemoveString(){
        String result = out.add("one");

        Assertions.assertThat(out.remove("one")).isEqualTo(result);
    }

    @Test
    public void shouldRemoveWithIndex(){
        String result = out.add(0,"one");

        Assertions.assertThat(out.remove(0)).isEqualTo(result);
    }
    @Test
    public void shouldSetString(){
        String result = out.add(0, "two");
        Assertions.assertThat(out.set(0, "two")).isEqualTo(result);
    }

    @Test
    public void checkContainsString(){
        String result = out.add("two");
        Assertions.assertThat(out.contains("two"));
    }

    @Test
    public void checkIndexOfMethod(){
        String result = out.add(0,"two");
        Assertions.assertThat(out.indexOf("two"));
    }

    @Test
    public void checkLastIndexOfMethod (){
        String result = out.add(0,"two");
        Assertions.assertThat(out.lastIndexOf("two"));
    }

    @Test
    public void shouldGetMethod (){
        String result = out.add(0,"two");
        Assertions.assertThat(out.get(0)).isEqualTo(result);
    }

    @Test
    public void checkEqualsMethod(){
        String result = out.add("two");
        Assertions.assertThat(out.equals("two"));
    }

    @Test
    public void checkSize(){
        String result = out.add("two");
        Assertions.assertThat(out.size());
    }

    @Test
    public void checkIsEmpty(){
        String result = out.add("two");
        out.remove("two");
        Assertions.assertThat(out.isEmpty());
    }

    @Test
    public void checkToArrayMethod(){
        String result = out.add("two");
        Assertions.assertThat(out.toArray());
    }
}
