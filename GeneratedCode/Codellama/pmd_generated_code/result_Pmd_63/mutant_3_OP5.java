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

    // MUTANT: Unreachable switch statement
    public void showMutant() {
        int value = getValue();
        switch (value) {
            case 1:
                // This branch is unreachable
                name = "John";
                age = 30;
                break;
            case 2:
                // This branch is also unreachable
                name = "Jane";
                age = 25;
                break;
            default:
                // This branch is the only reachable one
                name = "Unknown";
                age = -1;
                break;
        }
        System.out.println("Name: " + name + ", Age: " + age);
    }
}