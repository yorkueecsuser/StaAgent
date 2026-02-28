class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable because conditionWhile is always false
            System.out.println("This is an unreachable while loop");
        }
        
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }
    
    private boolean getCondition() {
        return false; // Method returning false ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"
    }
}