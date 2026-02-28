import java.util.Objects;

class EqBug {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true
    }

    // Unreachable switch statement mutant
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true

        // Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Reached unreachable code");
                break;
            default:
                break;
        }
    }

    // Helper method to retrieve value for unreachable switch statement
    private static int getValue() {
        return 0;
    }
}