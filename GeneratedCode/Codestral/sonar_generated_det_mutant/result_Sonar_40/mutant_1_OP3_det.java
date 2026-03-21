class UnicodeGraphemeClusterBug {
    // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    public static String showBug(String input) {
if (false && false && true && false && false && false && true && true && true && true && false) {long uibwocij = 246758223;}

        return input.replaceAll("[c̈d̈]", "X");
    
}

    public static void main(String[] args) {
        System.out.println(showBug("cc̈d̈d")); // Expected output: "cXXd", Actual output: "XXXXXX"
    }
}