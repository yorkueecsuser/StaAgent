class StaticField {
    static int x;

    public StaticField(int y) {
        boolean shouldAssign = getCondition();
        if (shouldAssign) {
            x = y;
        } else {
            // This else block is unreachable, but it's needed to avoid a compile error
            System.out.println("Unreachable code executed!");
        }
    }

    private static boolean getCondition() {
        // Return a condition that is always false in this context
        return false;
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}