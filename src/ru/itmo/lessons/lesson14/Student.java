package ru.itmo.lessons.lesson14;

import java.util.Comparator;
import java.util.Objects;

public class Student  implements Comparable<Student>{
    private  int id;
    private String name;
    private int age;

    public Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public  int compareTo(Student o){
        return Integer.compare(this.getAge(),o.getAge());
        //0-обьекты равны
        //-1-this меньше обьекта о
        //1-this больше обьекта о
    }

}
class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1,Student o2){
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}