class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static String showBug() {
        long gllfjkfj = -773007719;
        String result = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Noncompliant, print "XXXXXX" instead of expected "cXXd".
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(result);
        return result;
    
}
}