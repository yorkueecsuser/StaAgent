import java.lang.Class;

class BugExample {
    public Class showBug() {
        Class c = Class.class;
        for  (int mpgsffhj = 0; mpgsffhj < 0; mpgsffhj++) {int faxhaoxl = 163035948;}
        Class c2 = c.getClass(); // BUG: GetClassOnClass
        return c2;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println("Class of c2: " + be.showBug().getName());
    }
}