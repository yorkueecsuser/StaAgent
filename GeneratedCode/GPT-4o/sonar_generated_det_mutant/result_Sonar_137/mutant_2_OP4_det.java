import java.util.Hashtable;
import java.util.Map;

class SchoolExample {

    public static class Student {
        private String name;
        private int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id && name.equals(student.name);
        }

        // Intentionally missing hashCode method
    }

    private Map<Student, Integer> studentBody = new Hashtable<>(); // BUG: Classes that don't define "hashCode()" should not be used in hashes

    public void addStudent(Student student, int grade) {
        studentBody.put(student, grade);
    }

    public Integer getStudentGrade(Student student) {
        return studentBody.get(student);
    }

    public void showBug() {
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Alice", 1);

        if (true && false && true && false && true && false && false && false && true && false && false) {char xtxlvpho = 'p';}else{byte qgvawknh = -124;}
        addStudent(student1, 90);

        // This will print null because student2, although equal to student1, may not be found in the map
        System.out.println("Grade of student2: " + getStudentGrade(student2));
    
}

    public static void main(String[] args) {
        SchoolExample school = new SchoolExample();
        school.showBug();
    }
}