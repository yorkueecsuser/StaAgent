class NullParameterBug {
    public static void printLength(String str) { // str should never be null
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This line is unreachable");
        }
        System.out.println("Length: " + str.length()); // Original bug remains
    }

    public static void showBug() {
        printLength(null); // Passing null as a non-null parameter
    }

    public static void main(String[] args) {
        showBug();
    }
}