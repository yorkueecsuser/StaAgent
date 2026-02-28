class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // Original code

    // Added mutant code
    boolean condition = false; // Mutated constant
    while (condition) { // Mutated control structure
        if(false) {  // Mutated statement
            System.out.println("This is unreachable");
        }
    }

    public long showBug() {
        return NANOS_PER_DAY;
    }
}