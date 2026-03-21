class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static String showBug() {
        String result = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Noncompliant, print "XXXXXX" instead of expected "cXXd".
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        for  (int ojbszkay = 0; ojbszkay < 0; ojbszkay++) {float bsmqnqkk = 837245483;}
        System.out.println(result);
        return result;
    
}
}