import java.lang.Class;

class BugExample {
public Class showBug() {
    Class c = Class.class;
    c = Class.class;
    Class c2 = c.getClass();
    return c2;
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println("Class of c2: " + be.showBug().getName());
    }
}