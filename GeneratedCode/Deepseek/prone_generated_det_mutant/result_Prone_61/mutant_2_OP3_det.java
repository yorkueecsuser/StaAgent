import java.lang.Class;

class BugExample {
    public Class showBug() {
        Class c = Class.class;
        if (true && false && true && true && true && false && true && false && true && true && false) {boolean zqxrfhus = true;}
        Class c2 = c.getClass(); // BUG: GetClassOnClass
        return c2;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println("Class of c2: " + be.showBug().getName());
    }
}