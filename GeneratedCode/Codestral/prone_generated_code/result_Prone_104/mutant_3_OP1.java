class MathRoundIntLongBug {

    public int showBug(long number) {
        // Original code
        int unusedVariable = 42; // Dead store mutant
        return Math.round(number);
    }
}