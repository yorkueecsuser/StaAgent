class LossyPrimitiveCompare {
    public int showBug() {
        int max = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE - 1;
        String deadStore = "abcdefgh"; // dead store variable
        // BUG: LossyPrimitiveCompare
        return Float.compare(max, diff);
    }
}