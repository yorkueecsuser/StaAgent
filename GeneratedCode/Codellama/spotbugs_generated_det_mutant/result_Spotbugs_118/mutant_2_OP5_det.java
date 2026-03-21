import java.util.*;

class NPNullInstanceOfBug {
    public static void main(String[] args) {
        Object obj = null;
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        int izmtrbbe = 0;switch  (izmtrbbe) {case 1:byte zzczeanp = 88;break;default:String ktjyrfro = "mwjxazyo";break;}
        if (obj instanceof String) {
            System.out.println("Object is a string");
        } else {
            System.out.println("Object is not a string");
        }
    
}
}