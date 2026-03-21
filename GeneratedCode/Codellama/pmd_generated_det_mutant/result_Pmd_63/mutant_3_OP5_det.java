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
        int ibvvzibd = 0;switch  (ibvvzibd) {case 1:long lnvtlrvc = 519777117;break;default:byte faakgsgh = -16;break;}
        System.out.println("Name: " + name + ", Age: " + age);
    
}
}