class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static String showBug() {
        String zjinyvfk = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Noncompliant, print "XXXXXX" instead of expected "cXXd".
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(zjinyvfk);
        return zjinyvfk;
    }
}