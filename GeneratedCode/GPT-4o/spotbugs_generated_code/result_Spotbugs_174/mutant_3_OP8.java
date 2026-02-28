class MutableArrayExposure {

    private static String[] x = {"Apple", "Banana", "Cherry"};

    // This public static method exposes the internal mutable array representation
    public static String[] getFruits() {
        return x; // BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    // Method to demonstrate the bug
    public static void showBug() {
        // Getting the exposed array
        String[] y = getFruits();

        // Modifying the array
        y[0] = "Mango";

        // Displaying the modified array
        System.out.println("Modified Fruits Array: ");
        for (String fruit : x) {
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        // Demonstrating the bug
        showBug();
    }
}