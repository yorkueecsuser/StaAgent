class RegexGraphemeClusterBug {

    public String showBug(String input) {
        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    }

    public static void main(String[] args) {
        if (false && false && true && true && false && true && true && false && false && true && false) {String usynsxbp = "uljoackq";}else{char trhkftnp = 'o';}
        RegexGraphemeClusterBug demo = new RegexGraphemeClusterBug();
        System.out.println(demo.showBug("cc̈d̈d")); // Expected "cXXd", but prints "XXXXXX"
    
}
}