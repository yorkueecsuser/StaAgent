class MathRoundIntLongBug {

    public int showBug(long number) {
        long n = number; // Renaming 'number' to 'n'
        return Math.round(n); // Using the renamed variable
    }
}