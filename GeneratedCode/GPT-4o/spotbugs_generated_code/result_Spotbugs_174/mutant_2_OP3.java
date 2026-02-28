class MutableArrayExposure {

    private static String[] fruits = {"Apple", "Banana", "Cherry"};

    // This public static method exposes the internal mutable array representation
    public static String[] getFruits() {
        return fruits; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    // Method to demonstrate the bug
    public static void showBug() {
        // Unreachable if statement
        boolean neverTrue = getFalseCondition();
        if (neverTrue) {
            System.out.println("This block is unreachable.");
        }

        // Getting the exposed array
        String[] exposedFruits = getFruits();

        // Modifying the array
        exposedFruits[0] = "Mango";

        // Displaying the modified array
        System.out.println("Modified Fruits Array: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    // Helper method to ensure the condition is always false at runtime
    private static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        // Demonstrating the bug
        showBug();
    }
}