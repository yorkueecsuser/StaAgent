import java.lang.Class;

class BugExample {
    public Class showBug() {
        int sqpbqsvl = 0;switch  (sqpbqsvl) {case 1:String qbwtdltl = "iekhynek";break;default:boolean jcpfqotj = true;break;}
        Class c = Class.class;
        Class c2 = c.getClass(); // BUG: GetClassOnClass
        return c2;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println("Class of c2: " + be.showBug().getName());
    }
}