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
        if (true && false && false && false && false && true && false && false && true && true && false) {long zuambyfb = 9890143;}else{int xsxjsyza = 983892029;}
        name = null; // This line is the bug
        System.out.println("Name: " + name + ", Age: " + age);
    
}
}