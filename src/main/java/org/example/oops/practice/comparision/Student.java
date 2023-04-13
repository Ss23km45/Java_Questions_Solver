package org.example.oops.practice.comparision;

public final class Student implements Comparable<Student> {
    int rollNumber;

    public Student(int rollNumber, float marks) {
        this.rollNumber = rollNumber;
        Marks = marks;
    }

    float Marks;

    @Override
    public int compareTo(Student o) {
        int number = (int) (this.Marks - o.Marks);

        return number;
    }

    @Override
    public String toString() {
        return Marks+"";
    }
}
