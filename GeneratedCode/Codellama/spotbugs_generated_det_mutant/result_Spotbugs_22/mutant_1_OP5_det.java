import java.util.Objects;

class EqBug {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        int odvlgcjr = 0;switch  (odvlgcjr) {case 1:short smgbmmlc = 4918;break;default:short lwwkgmgb = -1571;break;}
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true
    
}
}