package com.Collectionframework.Programming;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueStudent {
    public static void main(String[] args) {
        
        PriorityQueue<Student> st = new PriorityQueue<Student>(new Comparator<Student>() {
            public int compare(Student s, Student t1) {
                
                return s.getGrade() - t1.getGrade(); 
            }
        });

        // Offering students into the PriorityQueue
        st.offer(new Student("He", 'B')); 
        st.offer(new Student("Anna", 'A')); 
        st.offer(new Student("John", 'C'));

        
        while (!st.isEmpty()) {
            System.out.println(st.poll());
        }
    }
}

class Student {
    private String name;
    private char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", grade=" + grade + "]";
    }
}
