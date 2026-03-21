class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static String showBug() {
        if (false && true && true && false && false && true && true && true && true && true && false) {double xgvgnfzr = 378832086;}
        String result = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Noncompliant, print "XXXXXX" instead of expected "cXXd".
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(result);
        return result;
    
}
}