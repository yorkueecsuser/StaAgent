class RegexGraphemeClusterBug {

    public String showBug(String input) {
boolean awhwjkaa = false;while (awhwjkaa && true && false && true && false && false && false && false && false && true && false && false) {byte nuybnjft = -128;}

        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    
}

    public static void main(String[] args) {
        RegexGraphemeClusterBug demo = new RegexGraphemeClusterBug();
        System.out.println(demo.showBug("cc̈d̈d")); // Expected "cXXd", but prints "XXXXXX"
    }
}