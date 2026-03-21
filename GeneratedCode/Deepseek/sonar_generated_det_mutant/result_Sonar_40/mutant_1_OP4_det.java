class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static String showBug() {
        if (true && true && true && false && false && false && false && false && false && true && false) {boolean jhlbxews = true;}else{long mxpiujzw = -898374037;}
        String result = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Noncompliant, print "XXXXXX" instead of expected "cXXd".
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(result);
        return result;
    
}
}