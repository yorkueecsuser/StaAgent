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
        if (true && false && false && true && true && true && true && true && false && true && false) {float hdzthqxg = 885150497;}
        name = null; // This line is the bug
        System.out.println("Name: " + name + ", Age: " + age);
    
}
}