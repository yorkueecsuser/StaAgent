class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }

    // Method to provide a condition for the unreachable for loop
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        
        // Unreachable for loop
        boolean conditionFor = demo.getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable line.");
        }
        
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"
    }
}