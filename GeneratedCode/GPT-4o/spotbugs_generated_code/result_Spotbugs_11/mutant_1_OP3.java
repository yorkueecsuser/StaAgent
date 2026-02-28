class CovariantArrayBugDemo {

    public Object showBug() {
        // Create an array of Number
        Number[] numbers = new Integer[5];
        
        // Insert an unreachable if statement using a non-final variable
        boolean isUnreachable = getFalseCondition();
        if (isUnreachable) {
            // This block is unreachable
            System.out.println("This should never print");
        }
        
        // Attempt to store a Double in an Integer array
        numbers[0] = 1.5; // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        
        return numbers[0];
    }

    // Method to ensure the if condition is always false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        CovariantArrayBugDemo demo = new CovariantArrayBugDemo();
        try {
            demo.showBug();
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }
    }
}