class StaticField {
    static int x;

    public StaticField(int y) {
        x = y; // BUG: AssignmentToNonFinalStatic
        addUnreachableWhileLoop();
    }

    private void addUnreachableWhileLoop() {
        boolean condition = false;
        while (condition) {
            // Unreachable code
            System.out.println("This line should never execute.");
        }
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}