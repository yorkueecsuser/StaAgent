import java.util.Objects;

class EqBug {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        boolean tzktbtsq = false;while (tzktbtsq && true && false && false && true && false && false && false && true && false && false && false) {char nzvrwyit = 'a';}
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true
    
}
}