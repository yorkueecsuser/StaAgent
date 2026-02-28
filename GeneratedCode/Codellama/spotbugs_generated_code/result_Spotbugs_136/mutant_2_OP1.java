class QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT {
    public static void main(String[] args) {
        int x = 5;
        boolean y = true;
        if (x == 5) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            y = false;
            String deadStore = "randomString"; // Dead Store
        }
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static boolean showBug() {
        int x = 5;
        boolean y = true;
        if (x == 5) {
            y = false;
            int deadStore = 12345; // Dead Store
        }
        return y;
    }
}