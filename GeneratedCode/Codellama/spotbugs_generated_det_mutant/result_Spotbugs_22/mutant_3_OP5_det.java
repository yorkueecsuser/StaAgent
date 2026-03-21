import java.util.Objects;

class EqBug {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        int rvaadhug = 0;switch  (rvaadhug) {case 1:long vvymfvhh = -480621549;break;default:String qscfiryr = "pxyeakdt";break;}
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true
    
}
}