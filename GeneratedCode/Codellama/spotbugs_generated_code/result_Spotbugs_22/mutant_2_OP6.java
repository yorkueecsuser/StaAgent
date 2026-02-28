import java.util.Objects;

class EqBug {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true
    }
}

// Mutated Code for Unreachable for loop

class EqBugMutated {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        Object obj1 = new Object();
        Object obj2 = new Object();
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println(obj1.equals(obj2)); // Output: true
        }
    }

    static boolean getCondition() {
        return false;
    }
}