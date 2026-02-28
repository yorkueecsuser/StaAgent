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
        int unreachableValue = getSwitchValue(); // non-final variable used
        switch (unreachableValue) {
            case 10:
                System.out.println("This is unreachable code.");
                break;
            default:
                // do nothing
        }
    }

    private static int getSwitchValue() {
        return 0; // This ensures that the switch statement does not hit case 10
    }

    public static void main(String[] args) {
        // Demonstrating the bug
        showBug();
    }
}