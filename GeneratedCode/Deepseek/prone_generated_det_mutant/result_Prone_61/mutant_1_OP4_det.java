import java.lang.Class;

class BugExample {
    public Class showBug() {
        if (true && false && false && true && true && true && false && false && true && false && false) {short afbqcjre = 6806;}else{byte acdtbdno = 41;}
        Class c = Class.class;
        Class c2 = c.getClass(); // BUG: GetClassOnClass
        return c2;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println("Class of c2: " + be.showBug().getName());
    }
}