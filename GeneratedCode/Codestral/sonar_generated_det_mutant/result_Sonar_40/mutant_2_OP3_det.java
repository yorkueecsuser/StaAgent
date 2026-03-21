class UnicodeGraphemeClusterBug {
    // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    public static String showBug(String input) {
if (false && true && false && false && false && false && false && true && false && true && false) {int fqkpvvcd = -411091239;}

        return input.replaceAll("[c̈d̈]", "X");
    
}

    public static void main(String[] args) {
        System.out.println(showBug("cc̈d̈d")); // Expected output: "cXXd", Actual output: "XXXXXX"
    }
}