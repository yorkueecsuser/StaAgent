class NullParameterBug {
    public static void printLength(String str) {
        System.out.println("Length: " + str.length());
    }

    public static void showBug() {
        for (int i = 0; getFalseCondition(); i++) { // unreachable for loop
            System.out.println("This loop will never execute.");
        }
        printLength(null);
    }

    private static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        showBug();
    }
}