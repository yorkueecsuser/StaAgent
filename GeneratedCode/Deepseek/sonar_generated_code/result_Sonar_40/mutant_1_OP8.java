class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String str = "cc̈d̈d".replaceAll("[c̈d̈]", "X"); // Mutant code: Renaming variable's' to'str'
        System.out.println(str); // Prints "cXXd"
    }
}