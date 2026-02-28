class StaticField {
    static int x;

    public StaticField(int y) {
        x = y;
        while (getUnreachableCondition()) { // Mutant: Unreachable while loop
            System.out.println("This is an unreachable block of code");
        }
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }

    private static boolean getUnreachableCondition() {
        return false; // This condition makes the while loop unreachable
    }
}