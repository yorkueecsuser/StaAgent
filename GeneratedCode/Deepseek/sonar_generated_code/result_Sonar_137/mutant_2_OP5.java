import java.util.*;

class School {
    private Map<Student, Integer> studentBody = new HashMap<Student, Integer>();

    public void addStudent(Student student, Integer id) {
        studentBody.put(student, id);
    }

    public Integer getStudentId(Student student) {
        return studentBody.get(student);
    }

    // BUG: Classes that don't define "hashCode()" should not be used in hashes
    public boolean showBug() {
        Student s1 = new Student("John", 123);
        Student s2 = new Student("John", 123);

        addStudent(s1, 1);
        return s1.equals(s2) && getStudentId(s2)!= null; // This will return true if s1 and s2 are same objects or have same values.
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

    // Intentionally missing hashCode method for demonstration
    /*
    public int hashCode() {
        return Objects.hash(name, id);
    }
    */
}