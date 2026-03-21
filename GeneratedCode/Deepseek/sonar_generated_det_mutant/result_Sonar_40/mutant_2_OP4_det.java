class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static String showBug() {
        if (true && false && false && true && false && false && false && true && false && true && false) {double ybyylvlr = 724753738;}else{short jyzvkgcs = -9693;}
        String result = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Noncompliant, print "XXXXXX" instead of expected "cXXd".
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(result);
        return result;
    
}
}