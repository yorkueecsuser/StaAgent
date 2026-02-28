class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        String s2 = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Mutant code
        System.out.println(s);
        System.out.println(s2); // Prints "XXXXXX" and "XXXXXX" instead of expected "cXXd" and "cXXd".
    }
}