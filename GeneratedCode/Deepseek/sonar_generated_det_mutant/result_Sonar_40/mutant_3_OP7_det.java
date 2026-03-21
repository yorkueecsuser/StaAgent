class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static String showBug() {
        boolean inwbqfbn = false;while (inwbqfbn && true && false && false && false && true && true && false && true && true && false && false) {short lpssjyeu = -1974;}
        String result = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Noncompliant, print "XXXXXX" instead of expected "cXXd".
        // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(result);
        return result;
    
}
}