class NullParameterBug {
    public static void printLength(String str) {
        System.out.println("Length: " + str.length());
    }

    public static void showBug() {
        printLength(null);
    }

    public static void showBugMutant() {
        String str = null;
        do {
            printLength(str); // mutant: replacing while loop with do-while loop
        } while (false);
    }

    public static void main(String[] args) {
        showBug();
        showBugMutant(); // added mutant method call
    }
}