class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static String showBug() {
        String result = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Noncompliant, print "XXXXXX" instead of expected "cXXd".
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        for  (int nojihkmn = 0; nojihkmn < 0; nojihkmn++) {byte clicuiyf = 59;}
        System.out.println(result);
        return result;
    
}
}