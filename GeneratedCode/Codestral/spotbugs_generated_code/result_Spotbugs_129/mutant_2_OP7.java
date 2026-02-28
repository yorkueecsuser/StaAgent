class ShiftBug {
    public int showBug(int x, int y) {
        // Mutant: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) { // This loop is unreachable
            System.out.println("This is an unreachable loop.");
        }

        return x << 8 + y; // Original bug remains: (x << 8) + y is intended
    }
}