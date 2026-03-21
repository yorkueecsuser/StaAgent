import java.lang.Class;

class BugExample {
    public Class showBug() {
        Class c = Class.class;
        if (false && true && true && false && true && false && true && false && false && true && false) {double sjjkcbac = 191700111;}
        Class c2 = c.getClass(); // BUG: GetClassOnClass
        return c2;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println("Class of c2: " + be.showBug().getName());
    }
}