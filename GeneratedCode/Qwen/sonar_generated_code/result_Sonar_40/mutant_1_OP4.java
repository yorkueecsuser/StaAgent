class RegexGraphemeClusterBug {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is a placeholder for any code that should logically run if needed
        } else {
            // This is an unreachable else branch due to the condition always being false at runtime
        }
        return input.replaceAll("[c̈d̈]", "X"); // This line contains the bug
    }

    private boolean getCondition() {
        // This method returns false, making the else branch unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexGraphemeClusterBug demo = new RegexGraphemeClusterBug();
        System.out.println(demo.showBug("cc̈d̈d")); // Expected "cXXd", but will print "XXXXXX"
    }
}