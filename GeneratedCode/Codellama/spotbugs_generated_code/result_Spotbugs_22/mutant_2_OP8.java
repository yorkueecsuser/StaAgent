import java.util.Objects;

class EqBug {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true
    }
}

// Mutant 1: Renaming variable 'obj1' to 'a'
class EqBug {
    public static void main(String[] args) {
        Object a = new Object();
        Object obj2 = new Object();
        System.out.println(a.equals(obj2)); // Output: true
    }
}

// Mutant 2: Renaming variable 'obj2' to 'b'
class EqBug {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object b = new Object();
        System.out.println(obj1.equals(b)); // Output: true
    }
}