// Original Java code
class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        System.out.println(i); // Outputs 0
    }
}

// Mutated Java code with Unreachable if statement
class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        if (false) { // Unreachable if statement
            i = 1;
        }
        System.out.println(i); // Outputs 0
    }
}