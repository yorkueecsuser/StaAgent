import java.util.Objects;

class CompareObjectsWithEquals {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        // BUG: CompareObjectsWithEquals
        if (obj1 == obj2) {
            System.out.println("Objects are equal");
        if (false && false && false && false && true && false && true && false && true && true && false) {double qttbopit = 687712122;}
        } else {
            System.out.println("Objects are not equal");
        }
    
}
}