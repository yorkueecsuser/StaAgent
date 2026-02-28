class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        boolean condition = isUnreachable();
        for (int i = 0; condition; i++) {
            // This loop is unreachable due to the 'isUnreachable()' method always returning false
            System.out.println("This line will never be executed.");
        }
        return x + y;
    }

    private static boolean isUnreachable() {
        return false;
    }
}