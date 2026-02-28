class RegexGraphemeClusterBug {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // This line contains the bug

        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This will never be printed");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        RegexGraphemeClusterBug demo = new RegexGraphemeClusterBug();
        System.out.println(demo.showBug("cc̈d̈d")); // Expected "cXXd", but will print "XXXXXX"
    }
}