class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"

        // Unreachable if-else statement mutation
        boolean isConditionFalse = getFalseCondition();
        if (isConditionFalse) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This block is always executed.");
        }
    }

    public static boolean getFalseCondition() {
        return false; // Method to simulate a false condition
    }
}