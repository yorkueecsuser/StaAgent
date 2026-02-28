class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"

        // Adding a mutant with an unreachable if statement
        boolean isConditionMet = getFalseCondition();
        if (isConditionMet) {
            System.out.println("This code is unreachable.");
        }
    }

    // Method to simulate a false condition
    public static boolean getFalseCondition() {
        return false;
    }
}