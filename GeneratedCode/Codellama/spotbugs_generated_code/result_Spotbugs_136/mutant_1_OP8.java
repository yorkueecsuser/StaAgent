class QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT {
    public static void main(String[] args) {
        int z = 5;
        boolean y = true;
        if (z == 5) { // BUG: QBA: Method assigns boolean literal in boolean expression (QBA_QUESTIONABLE_BOOLEAN_ASSIGNMENT)
            y = false;
        }
        System.out.println("x: " + z);
        System.out.println("y: " + y);
    }

    public static boolean showBug() {
        int z = 5;
        boolean y = true;
        if (z == 5) {
            y = false;
        }
        return y;
    }
}