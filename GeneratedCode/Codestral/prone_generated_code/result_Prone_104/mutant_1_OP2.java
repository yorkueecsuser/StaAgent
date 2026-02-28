class MathRoundIntLongBug {

    public int showBug(long number) {
        // Original code
        int result = Math.round(number);

        // Mutated code (duplication of the assignment statement)
        int duplicateResult = Math.round(number);

        return result;
    }
}