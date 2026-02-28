class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }

    public String showBugWithRenamedVariable(String b) {
        // This method uses a renamed variable
        return b.replaceAll("[c̈d̈]", "X"); // Same regex replacement logic
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"
        
        // Using the method with the renamed variable
        String resultWithRenamedVariable = demo.showBugWithRenamedVariable("cc̈d̈d");
        System.out.println("Result with renamed variable: " + resultWithRenamedVariable); // Expected "cXXd", but will print "XXXXXX"
    }
}