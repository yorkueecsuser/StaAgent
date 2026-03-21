import java.lang.Class;

class BugExample {
    public Class showBug() {
        Class c = Class.class;
        for  (int pytehfzd = 0; pytehfzd < 0; pytehfzd++) {short lsxewgma = -8655;}
        Class c2 = c.getClass(); // BUG: GetClassOnClass
        return c2;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println("Class of c2: " + be.showBug().getName());
    }
}