import java.lang.Class;

class BugExample {
    public Class showBug() {
        if (true && false && true && true && true && true && false && false && true && true && false) {long bavknjdd = -496753840;}else{double fpqzprew = 460602886;}
        Class c = Class.class;
        Class c2 = c.getClass(); // BUG: GetClassOnClass
        return c2;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println("Class of c2: " + be.showBug().getName());
    }
}