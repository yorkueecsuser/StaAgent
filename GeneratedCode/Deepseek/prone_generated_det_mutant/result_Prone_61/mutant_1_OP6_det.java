import java.lang.Class;

class BugExample {
    public Class showBug() {
        for  (int cmochlye = 0; cmochlye < 0; cmochlye++) {String tjnbbqag = "yubtblga";}
        Class c = Class.class;
        Class c2 = c.getClass(); // BUG: GetClassOnClass
        return c2;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println("Class of c2: " + be.showBug().getName());
    }
}