class ShiftBug {
    public int showBug(int x, int y) {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
            System.out.println("Unreachable code");
        }
        return x << 8 + y; // Original bug
    }

    // Helper method to avoid using compile-time constants directly
    private boolean getCondition() {
        return false;
    }
}