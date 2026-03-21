class UnicodeGraphemeClusterBug {
    // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
    public static String showBug(String input) {
for  (int idlwgnzf = 0; idlwgnzf < 0; idlwgnzf++) {float motlchhd = 569323680;}

        return input.replaceAll("[c̈d̈]", "X");
    
}

    public static void main(String[] args) {
        System.out.println(showBug("cc̈d̈d")); // Expected output: "cXXd", Actual output: "XXXXXX"
    }
}