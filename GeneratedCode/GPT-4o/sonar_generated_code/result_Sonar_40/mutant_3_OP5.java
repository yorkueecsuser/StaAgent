class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"
        
        // Unreachable switch statement mutant
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                System.out.println("This is not reachable.");
                break;
            case 2:
                System.out.println("Neither is this.");
                break;
            default:
                System.out.println("Default case is also not reachable.");
        }
    }
    
    // This method returns a value that makes the switch cases unreachable
    private static int getUnreachableValue() {
        return 3; // Chosen value that does not match any case
    }
}