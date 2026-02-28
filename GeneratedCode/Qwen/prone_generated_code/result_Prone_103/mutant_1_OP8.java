class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        return Float.compare(a, b); // BUG: LossyPrimitiveCompare

        // Mutant code with renaming of variable 'a'
        int x = Integer.MAX_VALUE;
        int b1 = Integer.MAX_VALUE - 1;
        return Float.compare(x, b1); // Mutant: Renamed 'a' to 'x'
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());

        // Mutant code with renaming of variable 'b'
        LossyPrimitiveCompareExample example1 = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result (mutant): " + example1.showBugWithMutantB());
    }

    public int showBugWithMutantB() {
        int a = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE - 1; // Mutant: Renamed 'b' to 'c'
        return Float.compare(a, c);
    }
}