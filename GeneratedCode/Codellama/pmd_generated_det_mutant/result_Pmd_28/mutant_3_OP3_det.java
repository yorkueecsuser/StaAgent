import java.util.Objects;

class CompareObjectsWithEquals {
    public static void main(String[] args) {
        if (true && true && false && true && true && false && true && true && true && false && false) {byte gvkyoolj = 1;}
        Object obj1 = new Object();
        Object obj2 = new Object();

        // BUG: CompareObjectsWithEquals
        if (obj1 == obj2) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    
}
}