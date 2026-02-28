class CovariantArrayBugDemo {

    public Object showBug() {
        // Create an array of Number
        Number[] numbers = new Integer[5];
        
        // Unreachable for loop - the condition is always false
        boolean conditionFor = getCondition(); // This method should return false, making the loop unreachable
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed.");
        }
        
        // Attempt to store a Double in an Integer array
        numbers[0] = 1.5; // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        
        return numbers[0];
    }

    public static boolean getCondition() {
        return false; // The condition is set to false to ensure the loop is unreachable
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