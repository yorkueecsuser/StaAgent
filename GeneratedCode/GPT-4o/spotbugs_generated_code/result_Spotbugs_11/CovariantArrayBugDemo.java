class CovariantArrayBugDemo {

    public Object showBug() {
        // Create an array of Number
        Number[] numbers = new Integer[5];
        
        // Attempt to store a Double in an Integer array
        numbers[0] = 1.5; // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition(); // Non-final variable to prevent unreachable statement error
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is unreachable.");
        }
        
        return numbers[0];
    }
    
    // Method to provide the condition, making the while loop unreachable
    private boolean getCondition() {
        return false; // Always returns false
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