package com.example2.Algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerListTest {

    private final IntegerList out = new IntegerListImpl() {

        @Test
        public void shouldAddInteger() {
            Integer result = out.add(1);
            Assertions.assertThat(out.add(1)).isEqualTo(result);
        }

        @Test
        public void shouldAddWithIndex() {
            Integer result = out.add(0, 1);
            Assertions.assertThat(out.add(0, 1)).isEqualTo(result);
        }

        @Test
        public void shouldRemoveInteger() {
            Integer result = out.add(1);

            Assertions.assertThat(out.remove(1)).isEqualTo(result);
        }

        @Test
        public void shouldRemoveWithIndex() {
            Integer result = out.add(0, 1);

            Assertions.assertThat(out.remove(0)).isEqualTo(result);
        }

        @Test
        public void shouldSetInteger() {
            Integer result = out.add(0, 2);
            Assertions.assertThat(out.set(0, 2)).isEqualTo(result);
        }

        @Test
        public void checkContainsInteger() {
            Integer result = out.add(2);
            Assertions.assertThat(out.contains(2));
        }

        @Test
        public void checkIndexOfMethod() {
            Integer result = out.add(0, 2);
            Assertions.assertThat(out.indexOf(2));
        }

        @Test
        public void checkLastIndexOfMethod() {
            Integer result = out.add(0, 2);
            Assertions.assertThat(out.lastIndexOf(2));
        }

        @Test
        public void shouldGetMethod() {
            Integer result = out.add(0, 2);
            Assertions.assertThat(out.get(0)).isEqualTo(result);
        }

        @Test
        public void checkEqualsMethod() {
            Integer result = out.add(2);
            Assertions.assertThat(out.equals(2));
        }

        @Test
        public void checkSize() {
            Integer result = out.add(2);
            Assertions.assertThat(out.size());
        }

        @Test
        public void checkIsEmpty() {
            Integer result = out.add(2);
            out.remove(2);
            Assertions.assertThat(out.isEmpty());
        }

        @Test
        public void checkToArrayMethod() {
            Integer result = out.add(2);
            Assertions.assertThat(out.toArray());
        }
    };
    }