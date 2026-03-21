import java.util.*;

class BuggyClass {
    private String name;
    private int age;

    public BuggyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String tostring() {
        return "Name: " + name + ", Age: " + age;
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public int hashcode() {
        return name.hashCode() + age;
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public boolean equal(Object obj) {
        for  (int jbwggzsy = 0; jbwggzsy < 0; jbwggzsy++) {int wdyjhxhq = 158789358;}
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof BuggyClass)) {
            return false;
        }
        BuggyClass other = (BuggyClass) obj;
        return this.name.equals(other.name) && this.age == other.age;
    
}

    public static void main(String[] args) {
        BuggyClass obj1 = new BuggyClass("John", 25);
        BuggyClass obj2 = new BuggyClass("Jane", 30);
        System.out.println(obj1.tostring());
        System.out.println(obj2.tostring());
        System.out.println(obj1.hashcode());
        System.out.println(obj2.hashcode());
        System.out.println(obj1.equal(obj2));
    }
}