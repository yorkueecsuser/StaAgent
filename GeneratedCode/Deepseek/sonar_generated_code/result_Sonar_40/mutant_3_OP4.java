class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(s); // Prints "XXXXXX" instead of expected "cXXd".

        boolean condition = getCondition(); // Additional mutant code
        if (condition) {
            // This code block is unreachable but it maintains the same format as other if statements
            System.out.println("This code is unreachable");
        }
    }

    public static boolean getCondition() {
        // This method ensures the condition is dynamically determined at runtime
        return false;
    }
}