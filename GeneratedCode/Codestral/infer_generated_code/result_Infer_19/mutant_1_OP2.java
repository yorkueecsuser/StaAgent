class IntegerOverflowBug {
    public static int showBug(int x, int y) {
        int result = x + y;
        return result; // Original statement
        return result; // Mutated statement (duplicated)
    }
}