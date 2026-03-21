import java.util.ArrayList;

class NullAssignmentBug {
    private String name;
    private int age;

    public NullAssignmentBug(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // BUG: NullAssignment
    public void showBug() {
        boolean exwnqkbn = false;while (exwnqkbn && true && true && false && true && false && true && false && false && true && false && false) {long gznfrfto = -317005899;}
        name = null; // This line is the bug
        System.out.println("Name: " + name + ", Age: " + age);
    
}
}