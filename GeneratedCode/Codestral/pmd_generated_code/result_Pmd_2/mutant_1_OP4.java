class StaticField {
    static int x;

    public StaticField(int y) {
        x = y;
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else branch
            if (false) {
                System.out.println("This branch is unreachable");
            } else {
                System.out.println("This branch is reachable");
            }
        }
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }

    private static boolean getCondition() {
        return Math.random() < 0.5; // Randomly return true or false
    }
}