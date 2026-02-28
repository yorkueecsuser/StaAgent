class NullParameterBug {
    public static void printLength(String str) {
        // Inserted unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code should never execute.");
        }

        System.out.println("Length: " + str.length()); // Original bug remains
    }

    public static void showBug() {
        printLength(null); // passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}