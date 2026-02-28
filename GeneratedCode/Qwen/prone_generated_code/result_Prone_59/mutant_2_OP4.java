import java.util.Objects;

class FuzzyEqualsBugExample {

    private double value;

    public FuzzyEqualsBugExample(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        FuzzyEqualsBugExample that = (FuzzyEqualsBugExample) o;
        // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
        return fuzzyEquals(this.value, that.value, 0.01);
    }

    private boolean fuzzyEquals(double a, double b, double tolerance) {
        return Math.abs(a - b) <= tolerance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public boolean showBug(FuzzyEqualsBugExample other) {
        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block should never execute
            System.out.println("This is an unreachable block");
        } else {
            // Alternative code
            System.out.println("Alternative code execution");
        }
        return this.equals(other);
    }

    private boolean getCondition() {
        // This method returns false, making the if-block unreachable
        return false;
    }

    public static void main(String[] args) {
        FuzzyEqualsBugExample example1 = new FuzzyEqualsBugExample(0.1 + 0.2);
        FuzzyEqualsBugExample example2 = new FuzzyEqualsBugExample(0.3);
        FuzzyEqualsBugExample example3 = new FuzzyEqualsBugExample(0.301);

        System.out.println("example1.equals(example2): " + example1.showBug(example2)); // Expected: true due to fuzzy equals
        System.out.println("example2.equals(example3): " + example2.showBug(example3)); // Expected: true due to fuzzy equals
        System.out.println("example1.equals(example3): " + example1.showBug(example3)); // Expected: false due to non-transitivity
    }
}