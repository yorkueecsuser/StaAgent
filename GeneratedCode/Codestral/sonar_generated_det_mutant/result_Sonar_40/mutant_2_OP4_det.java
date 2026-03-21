class UnicodeGraphemeClusterBug {
    // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    public static String showBug(String input) {
if (true && false && true && false && false && true && false && true && false && false && false) {double gafmbexv = 28471860;}else{short mgaguqkt = -4875;}

        return input.replaceAll("[c̈d̈]", "X");
    
}

    public static void main(String[] args) {
        System.out.println(showBug("cc̈d̈d")); // Expected output: "cXXd", Actual output: "XXXXXX"
    }
}