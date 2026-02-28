class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"

        // Adding unreachable switch statement for mutation testing
        int unreachableSwitchVar = getDynamicValue(); // This method will return a value that never matches the case
        switch (unreachableSwitchVar) {
            case 100:
                System.out.println("This case is unreachable.");
                break;
            default:
                // Default case, also unreachable by design
                break;
        }
    }

    // Method to return a value that doesn't match the switch case
    public static int getDynamicValue() {
        return 42; // Ensures the switch statement is not triggered
    }
}