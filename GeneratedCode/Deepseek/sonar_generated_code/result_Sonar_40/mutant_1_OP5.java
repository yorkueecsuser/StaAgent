class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(s); // Prints "XXXXXX" instead of expected "cXXd".

        // Mutant code start
        boolean unreachable = false;
        if (unreachable) {
            System.out.println("Unreachable branch");
        }
        // Mutant code end
    }
}