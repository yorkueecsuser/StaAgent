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
        for  (int qvyduotl = 0; qvyduotl < 0; qvyduotl++) {long inmwromf = -998183991;}
        name = null; // This line is the bug
        System.out.println("Name: " + name + ", Age: " + age);
    
}
}