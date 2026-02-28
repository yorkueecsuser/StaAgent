class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(s); // Prints "XXXXXX" instead of expected "cXXd".
    }

    public static void showMutant() {
        String s = "cc̈d̈d".replaceAll("[m̈n̈]", "X"); // Mutated version of the bug
        System.out.println(s); // Prints "cXXd"
    }
}