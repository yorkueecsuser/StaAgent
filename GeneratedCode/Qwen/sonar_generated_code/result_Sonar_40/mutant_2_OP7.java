class RegexGraphemeClusterBug {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This loop is unreachable");
        }
        return input.replaceAll("[c̈d̈]", "X"); // This line contains the bug
    }

    private boolean getCondition() {
        // This method returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexGraphemeClusterBug demo = new RegexGraphemeClusterBug();
        System.out.println(demo.showBug("cc̈d̈d")); // Expected "cXXd", but will print "XXXXXX"
    }
}