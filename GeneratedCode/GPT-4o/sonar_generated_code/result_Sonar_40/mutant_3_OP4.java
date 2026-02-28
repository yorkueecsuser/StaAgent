class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"
        
        // Inserting unreachable if-else statement
        boolean alwaysFalseCondition = getCondition();
        if (alwaysFalseCondition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the else branch of the unreachable if-else statement.");
        }
    }
    
    private static boolean getCondition() {
        // Always returns false to make the if condition unreachable
        return false;
    }
}