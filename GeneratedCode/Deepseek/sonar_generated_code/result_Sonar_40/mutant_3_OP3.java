class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // BUG: Unicode Grapheme Clusters should be avoided inside regex character classes
        System.out.println(s); // Prints "XXXXXX" instead of expected "cXXd".
    }

    public static boolean getCondition() {
        return false; // Non-final variable to avoid unreachable statement error
    }

    public static int getValue() {
        return 0; // Non-final variable to avoid unreachable statement error
    }
}