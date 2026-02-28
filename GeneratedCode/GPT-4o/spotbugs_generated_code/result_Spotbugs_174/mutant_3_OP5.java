class MutableArrayExposure {

    private static String[] fruits = {"Apple", "Banana", "Cherry"};

    // This public static method exposes the internal mutable array representation
    public static String[] getFruits() {
        return fruits; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    // Method to demonstrate the bug
    public static void showBug() {
        // Getting the exposed array
        String[] exposedFruits = getFruits();

        // Modifying the array
        exposedFruits[0] = "Mango";

        // Displaying the modified array
        System.out.println("Modified Fruits Array: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Unreachable switch statement
        int unreachable = determineUnreachableValue();
        switch (unreachable) {
            case 9999: // This case will never be reached due to the condition set in determineUnreachableValue()
                System.out.println("This will never be printed.");
                break;
            default:
                // The default block does nothing, maintaining the reachability without errors
                break;
        }
    }

    private static int determineUnreachableValue() {
        // Always returns a value other than 9999
        return 0;
    }

    public static void main(String[] args) {
        // Demonstrating the bug
        showBug();
    }
}