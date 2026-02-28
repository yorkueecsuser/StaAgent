import java.util.HashMap;
import java.util.Map;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Student student = (Student) o;
        return name!= null? name.equals(student.name) : student.name == null;
    }

    // BUG: Classes that don't define "hashCode()" should not be used in hashes
    // Without hashCode() method, this class cannot be correctly used in a HashMap or HashSet
}

class School {
    private Map<Student, Integer> studentBody = new HashMap<>();

    public void addStudent(Student student, Integer id) {
        studentBody.put(student, id);
    }

    public Integer getStudentId(Student student) {
        return studentBody.get(student);
    }

    public void showBug() {
        Student john = new Student("John");
        addStudent(john, 1);
        Student johnClone = new Student("John");
        // This will return null even though johnClone is equal to john
        System.out.println(getStudentId(johnClone));
    }
}