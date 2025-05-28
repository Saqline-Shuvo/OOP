import java.util.*;

class Student {
    String name;
    int age;
    String course;

    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String toString() {
        return name + ", Age: " + age + ", Course: " + course;
    }
}

public class StudentTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, Student> studentMap = new TreeMap<>();
        studentMap.put(101, new Student("Alice", 20, "Math"));
        studentMap.put(102, new Student("Bob", 22, "Physics"));

        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }
    }
}

