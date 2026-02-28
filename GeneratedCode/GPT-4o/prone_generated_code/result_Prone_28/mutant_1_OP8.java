class ConstantOverflowExample {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        return NANOS_PER_DAY;
    }

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY with bug: " + example.showBug());
    }
}

// Mutant code with Renaming operator applied
class ConstantOverflowExampleMutant {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long a = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
        return a;
    }

    public static void main(String[] args) {
        ConstantOverflowExampleMutant mutantExample = new ConstantOverflowExampleMutant();
        System.out.println("NANOS_PER_DAY with bug: " + mutantExample.showBug());
    }
}