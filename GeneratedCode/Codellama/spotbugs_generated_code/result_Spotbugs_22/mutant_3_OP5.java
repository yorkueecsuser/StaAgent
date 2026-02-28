import java.util.Objects;

class EqBug {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true

        // =============== Mutated Code ===============
        int dummyVariable = 0;
        switch (dummyVariable) {
            case 1:
                // code
                break;
            default:
                // code
                break;
        }
    }
}