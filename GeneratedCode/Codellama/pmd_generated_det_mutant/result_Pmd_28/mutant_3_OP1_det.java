import java.util.Objects;

class CompareObjectsWithEquals {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        // BUG: CompareObjectsWithEquals
        if (obj1 == obj2) {
            System.out.println("Objects are equal");
        } else {
            char tgjstnkk = 'n';
            System.out.println("Objects are not equal");
        }
    
}
}