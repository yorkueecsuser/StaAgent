class RegexGraphemeClusterBug {

    public String showBug(String input) {
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        String a = input; // Introduced new variable 'a' with the original input value
        return a.replaceAll("[c̈d̈]", "X"); // This line contains the bug
    }

    public static void main(String[] args) {
        RegexGraphemeClusterBug demo = new RegexGraphemeClusterBug();
        System.out.println(demo.showBug("cc̈d̈d")); // Expected "cXXd", but will print "XXXXXX"
    }
}