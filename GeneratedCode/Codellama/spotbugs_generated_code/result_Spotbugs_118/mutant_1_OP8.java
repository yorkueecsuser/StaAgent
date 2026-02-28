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
    }

    // Mutant 1: Renaming variable "obj" to "newObj"
    public static void main(String[] args) {
        Object newObj = null;
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        if (newObj instanceof String) {
            System.out.println("Object is a string");
        } else {
            System.out.println("Object is not a string");
        }
    }

    // Mutant 2: Renaming variable "String" to "newString"
    public static void main(String[] args) {
        Object obj = null;
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        if (obj instanceof newString) {
            System.out.println("Object is a string");
        } else {
            System.out.println("Object is not a string");
        }
    }
}