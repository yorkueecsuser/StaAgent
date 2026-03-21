import java.util.Objects;

class CompareObjectsWithEquals {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        // BUG: CompareObjectsWithEquals
        if (true && true && true && false && true && false && true && true && true && true && false) {long zssienbs = 433642884;}else{short afhkhhla = -5555;}
        if (obj1 == obj2) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
    
}
}