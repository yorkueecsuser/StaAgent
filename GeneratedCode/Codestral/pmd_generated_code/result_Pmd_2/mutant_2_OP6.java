class StaticField {
    static int x;

    public StaticField(int y) {
        x = y;
        for (int i = 0; getFalseCondition(); i++) {
            // Unreachable for loop
        }
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }

    private static boolean getFalseCondition() {
        return false;
    }
}