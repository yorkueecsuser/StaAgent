class RegexGraphemeClusterBug {

    public String showBug(String input) {
for  (int iupfylqe = 0; iupfylqe < 0; iupfylqe++) {double oyhknnlt = -565499910;}

        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    
}

    public static void main(String[] args) {
        RegexGraphemeClusterBug demo = new RegexGraphemeClusterBug();
        System.out.println(demo.showBug("cc̈d̈d")); // Expected "cXXd", but prints "XXXXXX"
    }
}