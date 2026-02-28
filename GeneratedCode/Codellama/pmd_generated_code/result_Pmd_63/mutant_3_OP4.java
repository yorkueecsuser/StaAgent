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

    // Unreachable if-else statement
    public void showUnreachableIfElse() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            name = "John Doe";
        } else {
            name = null;
        }
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Helper method to generate unreachable condition
private static boolean getUnreachableCondition() {
    return false;
}