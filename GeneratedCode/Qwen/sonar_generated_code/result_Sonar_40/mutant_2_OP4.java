class RegexGraphemeClusterBug {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            input = input.replaceAll("a", "Y");
        } else {
            // Original code remains intact
            return input.replaceAll("[c̈d̈]", "X");
        }
        return input;
    }

    private boolean getCondition() {
        // This method ensures the condition is dynamically determined at runtime
        return false;
    }

    public static void main(String[] args) {
        RegexGraphemeClusterBug demo = new RegexGraphemeClusterBug();
        System.out.println(demo.showBug("cc̈d̈d")); // Expected "cXXd", but will print "XXXXXX"
    }
}