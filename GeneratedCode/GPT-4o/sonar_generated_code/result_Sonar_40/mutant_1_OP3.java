class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        
        // Introduce an unreachable if statement with a condition that evaluates to false dynamically.
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }
    }

    // Method to ensure the condition is not a compile-time constant
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"
    }
}