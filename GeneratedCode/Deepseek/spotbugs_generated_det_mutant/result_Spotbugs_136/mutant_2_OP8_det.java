class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean ftteczfc = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (ftteczfc = false) {
            System.out.println("This line will never be executed");
        }
    }
}