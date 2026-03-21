import java.util.*;

class NPNullInstanceOfBug {
    public static void main(String[] args) {
        Object obj = null;
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        boolean yzgohtwk = false;while (yzgohtwk && true && false && false && false && false && false && true && true && true && true && false) {long ujnsctfj = 406808901;}
        if (obj instanceof String) {
            System.out.println("Object is a string");
        } else {
            System.out.println("Object is not a string");
        }
    
}
}