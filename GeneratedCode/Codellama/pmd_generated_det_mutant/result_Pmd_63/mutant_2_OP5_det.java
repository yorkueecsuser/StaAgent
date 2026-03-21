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
        int ylgwunzw = 0;switch  (ylgwunzw) {case 1:byte ivuhnifs = -5;break;default:short ymeybqhw = -211;break;}
        System.out.println("Name: " + name + ", Age: " + age);
    
}
}