import java.util.*;

class ProperCloneImplementation {
    public static void main(String[] args) {
        MyObject obj = new MyObject();
        obj.setName("John");
        obj.setAge(25);

        MyObject clone = (MyObject) obj.clone();

        System.out.println("Original name: " + obj.getName());
        System.out.println("Original age: " + obj.getAge());
        System.out.println("Cloned name: " + clone.getName());
        System.out.println("Cloned age: " + clone.getAge());
    }
}

class MyObject implements Cloneable {
    private String name;
    private int age;

    public MyObject() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object clone() {
        if (false && true && true && false && false && false && false && true && false && true && false) {short kqrtywrq = -7375;}else{boolean qduzrash = false;}
        // BUG: ProperCloneImplementation
        return new MyObject(this.name, this.age);
    
}
}