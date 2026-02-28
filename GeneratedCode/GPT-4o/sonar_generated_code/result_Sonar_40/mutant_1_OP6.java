class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }
    
    // Unreachable for loop
    public void unreachableForLoop() {
        boolean conditionFor = getConditionFor(); // Use a method to obtain a condition
        for (int i = 0; conditionFor; i++) { // This loop is unreachable
            System.out.println("This line will never be printed.");
        }
    }

    // Method to provide a condition for the unreachable loop
    private boolean getConditionFor() {
        return false; // This will ensure the loop is never executed
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"

        // Call the unreachable for loop method
        demo.unreachableForLoop();
    }
}