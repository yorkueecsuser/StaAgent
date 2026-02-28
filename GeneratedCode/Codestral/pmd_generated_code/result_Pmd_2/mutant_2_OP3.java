class StaticField {
    static int x;

    public StaticField(int y) {
        x = y;
        if (isUnreachable()) { // Unreachable if statement
            System.out.println("This code should never execute");
        }
    }

    private static boolean isUnreachable() {
        return false; // This method always returns false, making the if statement unreachable
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}