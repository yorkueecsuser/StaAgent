class LossyPrimitiveCompareBug {
    public int showBug() {
        // Original code
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        return Float.compare(a, b);

        // Mutant code
        int c = a;
        int d = b;
        return Float.compare(c, d);
    }
}