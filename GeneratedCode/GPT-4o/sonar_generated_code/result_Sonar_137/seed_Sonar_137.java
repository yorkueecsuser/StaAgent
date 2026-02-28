import java.util.Hashtable;
import java.util.Map;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    // No hashCode method defined
}

class School {
    private Map<Student, Integer> studentBody = new Hashtable<>(); // BUG: Classes that don't define "hashCode()" should not be used in hashes

    public School() {
        // Adding some students
        studentBody.put(new Student("Alice"), 1);
        studentBody.put(new Student("Bob"), 2);
    }

    public Integer showBug(String studentName) {
        // Demonstrate the bug by attempting to retrieve a Student object that logically "equals" an existing key
        Student student = new Student(studentName);
        return studentBody.get(student);
    }

    public static void main(String[] args) {
        School school = new School();
        // Try to retrieve a student by name
        System.out.println(school.showBug("Alice"));
        System.out.println(school.showBug("Bob"));
        System.out.println(school.showBug("Charlie"));
    }
}