class MathRoundIntLongBug {

    public int showBug(long number) {
        int result = Math.round(number);
        // Mutation: Duplicating the assignment statement
        int duplicatedResult = Math.round(number);
        return result;
    }
}