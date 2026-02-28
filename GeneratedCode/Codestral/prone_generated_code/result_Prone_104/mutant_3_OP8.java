class MathRoundIntLongBug {

    public int showBug(long number) {
        long n = number; // Added mutant code: Renaming the variable
        return Math.round(n);
    }
}