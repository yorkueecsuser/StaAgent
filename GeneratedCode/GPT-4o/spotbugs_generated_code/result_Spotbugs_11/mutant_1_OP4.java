class CovariantArrayBugDemo {

    public Object showBug() {
        // Create an array of Number
        Number[] numbers = new Integer[5];
        
        // Attempt to store a Double in an Integer array
        numbers[0] = 1.5; // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)

        // Introduce a non-final variable for unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is unreachable code block");
        } else {
            System.out.println("This block is always executed");
        }

        return numbers[0];
    }

    // A method to simulate dynamic condition evaluation
    public boolean getCondition() {
        return false; // The condition is always false, making the if-block unreachable
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