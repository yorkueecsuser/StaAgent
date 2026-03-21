import java.util.Hashtable;
import java.util.Map;

class Student { // BUG: Classes that don't define "hashCode()" should not be used in hashes
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
        return id == student.id && name.equals(student.name);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class School {
    private Map<Student, Integer> studentBody = new Hashtable<>();

    public void addStudent(Student student, Integer grade) {
        studentBody.put(student, grade);
    }

    public Integer getStudentGrade(Student student) {
        return studentBody.get(student);
    }
public void showBug() {
    Student student1 = new Student("John Doe" , 1);
    student1 = new Student("John Doe" , 1);
    Student student2 = new Student("John Doe" , 1);
    addStudent(student1 , 10);
    System.out.println(getStudentGrade(student2));
}
}