import java.lang.Class;

class BugExample {
    public Class showBug() {
        Class c = Class.class;
        int xcjvavty = 0;switch  (xcjvavty) {case 1:char ofzkkhhy = 'c';break;default:int gjnlcaij = 532489385;break;}
        Class c2 = c.getClass(); // BUG: GetClassOnClass
        return c2;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println("Class of c2: " + be.showBug().getName());
    }
}