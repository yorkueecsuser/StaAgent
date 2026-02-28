class RegexGraphemeClusterBug {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // Unreachable code block
            System.out.println("This is an unreachable code block.");
        }
        return input.replaceAll("[c̈d̈]", "X"); // This line contains the bug
    }

    private boolean getCondition() {
        // This method returns a condition that is always false at runtime
        return false;
    }

    public static void main(String[] args) {
        RegexGraphemeClusterBug demo = new RegexGraphemeClusterBug();
        System.out.println(demo.showBug("cc̈d̈d")); // Expected "cXXd", but will print "XXXXXX"
    }
}