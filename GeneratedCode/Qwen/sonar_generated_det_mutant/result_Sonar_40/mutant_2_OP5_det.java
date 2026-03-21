class RegexGraphemeClusterBug {

    public String showBug(String input) {
int zthlppna = 0;switch  (zthlppna) {case 1:long wepnhirr = 511817105;break;default:double dyifthwp = 218029783;break;}

        return input.replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    
}

    public static void main(String[] args) {
        RegexGraphemeClusterBug demo = new RegexGraphemeClusterBug();
        System.out.println(demo.showBug("cc̈d̈d")); // Expected "cXXd", but prints "XXXXXX"
    }
}