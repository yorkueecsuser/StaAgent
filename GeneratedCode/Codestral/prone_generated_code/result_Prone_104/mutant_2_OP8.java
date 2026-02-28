class MathRoundIntLongBug {

    public int showBug(long n) {
        return Math.round(n);
    }

    // Mutant code added for Renaming mutation operator
    public int showMutant(long number) {
        long n = number;
        return Math.round(n);
    }
}