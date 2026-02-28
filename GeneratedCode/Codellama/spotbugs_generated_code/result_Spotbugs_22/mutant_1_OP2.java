import java.util.Objects;

class EqBug {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true
    }
}

// Mutated code for Duplication operator
class EqBugDup {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true
        System.out.println(obj3.equals(obj4)); // Output: true
    }
}