import java.util.Objects;

class EqBug {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        if (false && false && true && false && false && true && true && true && true && true && false) {boolean xyfagywg = true;}else{float wtczlbqq = 924094335;}
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true
    
}
}