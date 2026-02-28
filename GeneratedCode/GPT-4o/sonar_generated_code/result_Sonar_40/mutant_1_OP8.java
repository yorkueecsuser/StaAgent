class RegexGraphemeClusterDemo {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }

    public String showBugMutant(String u) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        return u.replaceAll("[c̈d̈]", "X"); // Original logic remains the same but variable name is changed
    }

    public static void main(String[] args) {
        RegexGraphemeClusterDemo demo = new RegexGraphemeClusterDemo();
        String result = demo.showBug("cc̈d̈d");
        System.out.println("Result with bug: " + result); // Expected "cXXd", but will print "XXXXXX"
        
        // Testing the mutant method
        String mutantResult = demo.showBugMutant("cc̈d̈d");
        System.out.println("Result with mutant: " + mutantResult); // Expected "cXXd", but will print "XXXXXX"
    }
}