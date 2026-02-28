class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }
    
    private int getSwitchValue() {
        return 2; // This ensures the switch statement is unreachable
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"

        // Inserting an unreachable switch statement
        RegexGraphemeClusterDemo example = new RegexGraphemeClusterDemo();
        int switchValue = example.getSwitchValue();
        switch (switchValue) {
            case 1:
                System.out.println("This is unreachable");
                break;
        }
    }
}