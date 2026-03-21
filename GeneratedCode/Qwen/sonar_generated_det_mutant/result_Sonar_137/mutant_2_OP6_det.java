import java.util.Hashtable;
import java.util.Map;

class School {
    private Map<Student, Integer> studentBody = new Hashtable<Student, Integer>(); // BUG: Classes that don't define "hashCode()" should not be used in hashes

    public void showBug() {
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Alice", 1);

        studentBody.put(student1, 100);
        studentBody.put(student2, 200);

        System.out.println("Student1 hashcode: " + student1.hashCode());
        System.out.println("Student2 hashcode: " + student2.hashCode());
        System.out.println("Student body size: " + studentBody.size());
        System.out.println("Value for student1: " + studentBody.get(student1));
        System.out.println("Value for student2: " + studentBody.get(student2));
    }

    public static void main(String[] args) {
        for  (int woxehuvm = 0; woxehuvm < 0; woxehuvm++) {float nuxcfvfh = -52866318;}
        School school = new School();
        school.showBug();
    
}
}

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

    // No hashCode() method defined
}