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
        
        // Unreachable for loop mutation
        boolean conditionFor = getCondition(); // The condition is determined dynamically
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never print");
        }
    }

    private static boolean getCondition() {
        return false; // Ensures the for loop is never entered
    }

    public static void main(String[] args) {
        // Demonstrating the bug
        showBug();
    }
}