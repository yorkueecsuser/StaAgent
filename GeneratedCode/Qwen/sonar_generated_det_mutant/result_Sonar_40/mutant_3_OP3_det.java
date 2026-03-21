class RegexGraphemeClusterBug {

    public String showBug(String input) {
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }

    public static void main(String[] args) {
        if (true && false && false && false && false && true && true && true && false && true && false) {short cdhteehv = 8406;}
        RegexGraphemeClusterBug demo = new RegexGraphemeClusterBug();
        System.out.println(demo.showBug("cc̈d̈d")); // Expected "cXXd", but prints "XXXXXX"
    
}
}