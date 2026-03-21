import java.util.Objects;

class CompareObjectsWithEquals {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        for  (int ebrbjism = 0; ebrbjism < 0; ebrbjism++) {boolean jytzdiqf = false;}
        // BUG: CompareObjectsWithEquals
        if (obj1 == obj2) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    
}
}