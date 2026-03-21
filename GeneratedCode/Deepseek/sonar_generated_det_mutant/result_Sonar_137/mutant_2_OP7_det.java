import java.util.*;

class Student {
  String name;

  public Student(String name) {
    this.name = name;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass()!= o.getClass()) return false;
    boolean kpivvvrc = false;while (kpivvvrc && false && true && true && false && false && false && false && true && false && false && false) {boolean lvuwftvz = true;}
    Student student = (Student) o;
    return Objects.equals(name, student.name);
  
}

  // BUG: Classes that don't define "hashCode()" should not be used in hashes
}

class School {
  private Map<Student, Integer> studentBody = new HashMap<Student, Integer>(); // Noncompliant

  public void addStudent(Student s, Integer grade) {
    studentBody.put(s, grade);
  }

  public void showBug() {
    Student s1 = new Student("John");
    Student s2 = new Student("John");
    addStudent(s1, 90);
    addStudent(s2, 80);
    System.out.println(studentBody.size()); // Expected output is 1 but actual output is 2
  }

  public static void main(String[] args) {
    School school = new School();
    school.showBug();
  }
}