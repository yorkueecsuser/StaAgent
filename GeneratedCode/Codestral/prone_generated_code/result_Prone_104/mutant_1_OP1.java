class MathRoundIntLongBug {

    public int showBug(long number) {
        // Original code
        int unusedVariable = 10; //Dead Store mutation
        return Math.round(number);
    }
}