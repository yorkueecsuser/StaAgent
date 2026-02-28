class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }
    
    // Adding a helper method to determine condition dynamically
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"
        
        // Inserting unreachable if-else branch
        boolean condition = demo.getUnreachableCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This is the reachable else branch.");
        }
    }
}