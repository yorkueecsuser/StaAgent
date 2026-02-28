class StaticField {
    static int x;

    public StaticField(int y) {
        x = y;
        for (int i = 0; getFalseCondition(); i++) {   // Mutant: Unreachable for loop
            System.out.println("This is an unreachable loop.");
        }
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }

    private static boolean getFalseCondition() {
        return false;   // This method always returns false
    }
}