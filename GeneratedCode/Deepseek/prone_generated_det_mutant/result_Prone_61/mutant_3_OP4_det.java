import java.lang.Class;

class BugExample {
    public Class showBug() {
        Class c = Class.class;
        if (false && false && true && false && false && false && true && false && true && false && false) {short apwnpqen = -923;}else{float ejgyikwo = -910602343;}
        Class c2 = c.getClass(); // BUG: GetClassOnClass
        return c2;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println("Class of c2: " + be.showBug().getName());
    }
}