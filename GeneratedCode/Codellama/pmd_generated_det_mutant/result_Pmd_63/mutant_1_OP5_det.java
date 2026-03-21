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
        int zwtkzhus = 0;switch  (zwtkzhus) {case 1:float qkcpetoh = 864030463;break;default:char lcwgvirm = 'g';break;}
        name = null; // This line is the bug
        System.out.println("Name: " + name + ", Age: " + age);
    
}
}