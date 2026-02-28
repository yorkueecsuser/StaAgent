class CovariantArrayBugDemo {

    public Object showBug() {
        // Create an array of Number
        Number[] numbers = new Integer[5];
        
        // Attempt to store a Double in an Integer array
        numbers[0] = 1.5; // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        
        // Insert unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable because conditionWhile is derived from getCondition(), which returns false.
            System.out.println("Unreachable code inside while loop");
        }
        
        return numbers[0];
    }
    
    // Method to simulate a condition that evaluates to false
    private boolean getCondition() {
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