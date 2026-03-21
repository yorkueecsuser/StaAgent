import java.lang.Class;

class BugExample {
    public Class showBug() {
        boolean fkjxckqf = false;while (fkjxckqf && false && false && true && false && true && true && true && true && true && true && false) {long czlyfhde = 507677457;}
        Class c = Class.class;
        Class c2 = c.getClass(); // BUG: GetClassOnClass
        return c2;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println("Class of c2: " + be.showBug().getName());
    }
}