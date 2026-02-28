class QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT {
    public static void main(String[] args) {
        int x = 5;
        boolean y = true;
        boolean z = false; // Dead store
        if (x == 5) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            y = false;
        }
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static boolean showBug() {
        int x = 5;
        boolean y = true;
        boolean z = false; // Dead store
        if (x == 5) {
            y = false;
        }
        return y;
    }
}