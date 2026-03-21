class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean kaalszvb = true;

        // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
        if (kaalszvb = false) {
            System.out.println("This line will never be executed");
        }
    }
}