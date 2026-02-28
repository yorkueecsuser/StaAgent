class Main {
    private static String deadStoreVariable; // dead store variable

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Unused variable
        System.out.println(s); // Prints "XXXXXX" instead of expected "cXXd".
    }
}