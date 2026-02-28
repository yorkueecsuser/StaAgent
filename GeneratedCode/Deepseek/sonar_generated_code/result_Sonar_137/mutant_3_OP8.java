import java.util.*;

class School {
    private Map<Student, Integer> studentBody = new HashMap<Student, Integer>();

    public void addStudent(Student student, Integer id) {
        studentBody.put(student, id);
    }

    public Integer getStudentId(Student student) {
        return studentBody.get(student);
    }

    public boolean showBug() {
        Student s1 = new Student("John", 123);
        Student s2 = new Student("John", 123);

        addStudent(s1, 1);
        return getStudentId(s2)!= null; // This should return false as s1 and s2 are different objects with the same values
    }
}

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    // Mutated hashCode method renamed from "hashCode" to "renamedHashCode"
    public int renamedHashCode() {
        return Objects.hash(name, id);
    }
}