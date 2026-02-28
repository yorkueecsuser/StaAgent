class ConstantOverflowExample {

    // BUG: ConstantOverflow
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000;

    // Mutant: Renaming NANOS_PER_DAY to x
    static final long x = 24 * 60 * 60 * 1000 * 1000 * 1000;

    public long showBug() {
        return NANOS_PER_DAY;
    }

    // Mutant method to demonstrate the renamed variable
    public long showMutantBug() {
        return x;
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY: " + example.showBug());
        System.out.println("Mutant x: " + example.showMutantBug());
    }
}