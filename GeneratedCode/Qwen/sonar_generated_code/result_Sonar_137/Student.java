import java.util.Hashtable;
import java.util.Map;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && name.equals(student.name);
    }

    // BUG: Classes that don't define "hashCode()" should not be used in hashes
}

class School {
    private Map<Student, Integer> studentBody = new Hashtable<>();

    public void addStudent(Student student, Integer grade) {
        studentBody.put(student, grade);
    }

    public Integer getStudentGrade(Student student) {
        return studentBody.get(student);
    }

    public void showBug(Student student1, Student student2) {
        addStudent(student1, 90);
        addStudent(student2, 85);

        // Since student1 and student2 are equal but have different hashCodes,
        // the second put operation will override the first one.
        System.out.println("Grade for student1: " + getStudentGrade(student1)); // This will print 85 instead of 90
        System.out.println("Grade for student2: " + getStudentGrade(student2)); // This will print 85
    }
}

class BugDemonstration {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Alice", 1);

        School school = new School();
        school.showBug(student1, student2);
    }
}