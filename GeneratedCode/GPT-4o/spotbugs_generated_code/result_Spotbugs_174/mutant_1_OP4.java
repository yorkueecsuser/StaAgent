class MutableArrayExposure {

    private static String[] fruits = {"Apple", "Banana", "Cherry"};

    // This public static method exposes the internal mutable array representation
    public static String[] getFruits() {
        return fruits; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
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
        
        // Inserting unreachable if-else branch
        boolean condition = getFalseCondition(); // dynamically generated condition
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is an unreachable else branch.");
        }
    }

    // A method that always returns false to ensure the if-else statement remains unreachable
    private static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        // Demonstrating the bug
        showBug();
    }
}