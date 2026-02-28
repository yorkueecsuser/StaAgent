class CovariantArrayBugDemo {

    public Object showBug() {
        // Create an array of Number
        Number[] numbers = new Integer[5];
        
        // Introduce an unreachable if-else branch
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            // Attempt to store a Double in an Integer array
            numbers[0] = 1.5; // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
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
    
    private boolean getFalseCondition() {
        return false;
    }
}