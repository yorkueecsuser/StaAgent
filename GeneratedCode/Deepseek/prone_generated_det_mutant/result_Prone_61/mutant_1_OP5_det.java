import java.lang.Class;

class BugExample {
    public Class showBug() {
        int cjmkigje = 0;switch  (cjmkigje) {case 1:int mknggtxk = 611573845;break;default:int qejscgtw = 809880059;break;}
        Class c = Class.class;
        Class c2 = c.getClass(); // BUG: GetClassOnClass
        return c2;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println("Class of c2: " + be.showBug().getName());
    }
}