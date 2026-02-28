class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"

        // Inserting unreachable while loop
        boolean isConditionMet = getCondition();
        while (isConditionMet) {
            // This block is unreachable
            System.out.println("This message will never be printed.");
        }
    }

    // Method to simulate a condition, initially false
    public static boolean getCondition() {
        return false;
    }
}