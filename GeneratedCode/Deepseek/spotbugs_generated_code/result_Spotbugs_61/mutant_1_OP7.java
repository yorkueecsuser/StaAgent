class NullParameterBug {
    private static boolean getCondition() {
        return false;
    }

    public static void printLength(String str) {
        System.out.println("Length: " + str.length());

        // Mutant Code: Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This line should never execute.");
        }
    }

    public static void showBug() {
        printLength(null);
    }

    public static void main(String[] args) {
        showBug();
    }
}