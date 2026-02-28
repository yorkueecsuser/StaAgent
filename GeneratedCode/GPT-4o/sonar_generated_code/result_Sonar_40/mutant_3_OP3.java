class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }

    private boolean getCondition() {
        // This method is used to ensure the condition is not a compile-time constant.
        return false;
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"

        // Adding a mutant: unreachable if branch
        boolean condition = demo.getCondition();
        if (condition) {
            System.out.println("This code is unreachable because the condition is always false.");
        }
    }
}