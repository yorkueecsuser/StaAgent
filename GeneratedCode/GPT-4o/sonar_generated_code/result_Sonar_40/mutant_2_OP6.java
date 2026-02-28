class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"

        // Unreachable for loop mutant
        boolean conditionFor = getCondition(); // Using a method call to simulate runtime decision
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be printed.");
        }
    }
    
    // Helper method to simulate a runtime condition
    private static boolean getCondition() {
        return false; // Hardcoded to false, but not a compile-time constant
    }
}