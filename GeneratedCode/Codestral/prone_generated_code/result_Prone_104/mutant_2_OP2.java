class MathRoundIntLongBug {

    public int showBug(long number) {
        // Original code
        int result = Math.round(number);

        // Mutation: Duplication of the assignment statement
        int duplicatedResult = Math.round(number);

        return result;
    }
}