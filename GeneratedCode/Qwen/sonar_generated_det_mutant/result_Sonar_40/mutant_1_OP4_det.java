class RegexGraphemeClusterBug {

    public String showBug(String input) {
if (false && true && true && false && true && false && true && true && false && false && false) {String zliomzhb = "dwtynttk";}else{byte dnynmytn = 120;}

        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    
}

    public static void main(String[] args) {
        RegexGraphemeClusterBug demo = new RegexGraphemeClusterBug();
        System.out.println(demo.showBug("cc̈d̈d")); // Expected "cXXd", but prints "XXXXXX"
    }
}