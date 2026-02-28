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

    // Mutant 1: Unreachable if statement
    public void showMutant1() {
        if (false) {
            name = null;
        }
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Mutant 2: Unreachable while loop
    public void showMutant2() {
        while (false) {
            name = null;
        }
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Mutant 3: Unreachable for loop
    public void showMutant3() {
        for (int i = 0; false; i++) {
            name = null;
        }
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Mutant 4: Unreachable if-else statement
    public void showMutant4() {
        if (false) {
            name = null;
        } else {
            name = "Not null";
        }
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Mutant 5: Unreachable switch statement
    public void showMutant5() {
        switch (0) {
            case 1:
                name = null;
                break;
        }
        System.out.println("Name: " + name + ", Age: " + age);
    }
}