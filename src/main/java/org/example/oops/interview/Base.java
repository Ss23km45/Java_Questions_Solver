package org.example.oops.interview;

import java.util.Objects;

public class Base {
    private int age;
    private String name;
    private float marks;

    public Base() {
        this.age = 00;
        this.name = "Not Provided by You";
        this.marks = 100.00f;
    }

    public Base(int age, String name, float marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public float getMarks() {
        return marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Base base = (Base) o;
        return age == base.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, marks);
    }
}
