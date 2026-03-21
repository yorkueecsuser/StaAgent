class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean wtbjftcs = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (wtbjftcs = false) {
            System.out.println("This line will never be executed");
        }
    }
}