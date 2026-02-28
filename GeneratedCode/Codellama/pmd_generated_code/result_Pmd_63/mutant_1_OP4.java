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
        name = null; // This line is the bug
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Mutant 1: Unreachable if-else statement
    public void showMutant1() {
        boolean condition = getCondition();
        if (condition) {
            name = null;
            System.out.println("Name: " + name + ", Age: " + age);
        } else {
            // This branch is unreachable
            name = "Unreachable code";
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }
}