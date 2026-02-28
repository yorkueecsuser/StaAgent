class MathRoundIntLongBug {

    public int showBug(long number) {
        // Original code
        int unusedVariable = 0; // Dead store mutation
        return Math.round(number);
    }
}