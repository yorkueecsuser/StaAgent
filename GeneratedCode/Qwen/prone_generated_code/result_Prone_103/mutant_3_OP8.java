class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        return Float.compare(a, b); // BUG: LossyPrimitiveCompare

        // Mutant code with renaming variable 'a' to 'x'
        int x = Integer.MAX_VALUE;
        int b1 = Integer.MAX_VALUE - 1;
        return Float.compare(x, b1); // Mutant: Renamed 'a' to 'x'
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }
}