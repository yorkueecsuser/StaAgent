class CovariantArrayBugDemo {

    public Object showBug() {
        // Create an array of Number
        Number[] numbers = new Integer[5];
        
        // Attempt to store a Double in an Integer array
        numbers[0] = 1.5; // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)

        // Insert an unreachable if statement mutation
        // Using a method to ensure the condition is not a compile-time constant
        if (alwaysFalse()) {
            System.out.println("This code is unreachable.");
        }
        
        return numbers[0];
    }

    public static void main(String[] args) {
        CovariantArrayBugDemo demo = new CovariantArrayBugDemo();
        try {
            demo.showBug();
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }
    }
    
    // Method to ensure the condition is not a compile-time constant
    private boolean alwaysFalse() {
        return false;
    }
}