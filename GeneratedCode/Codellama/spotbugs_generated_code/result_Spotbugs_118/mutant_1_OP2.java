import java.util.*;

class NPNullInstanceOfBug {
    public static void main(String[] args) {
        Object obj = null;
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        if (obj instanceof String) {
            System.out.println("Object is a string");
        } else {
            System.out.println("Object is not a string");
        }
        
        // Mutated code: Duplicate the assignment statement and insert immediately after its current location
        Object obj2 = null;
        if (obj2 instanceof String) {
            System.out.println("Object is a string");
        } else {
            System.out.println("Object is not a string");
        }
    }
}