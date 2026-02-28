import java.util.Objects;

class FuzzyEqualsExample {

    private double value;

    public FuzzyEqualsExample(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FuzzyEqualsExample other = (FuzzyEqualsExample) obj;
        return DoubleMath.fuzzyEquals(this.value, other.value, 0.0001); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public boolean showBug(double value1, double value2) {
        FuzzyEqualsExample obj1 = new FuzzyEqualsExample(value1);
        FuzzyEqualsExample obj2 = new FuzzyEqualsExample(value2);
        
        // Insert unreachable switch statement
        int switchCondition = getUnreachableCondition();
        switch (switchCondition) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            case 2:
                System.out.println("This case is also unreachable");
                break;
            default:
                // Default case is also unreachable
                System.out.println("Default case");
                break;
        }

        return obj1.equals(obj2);
    }

    // Helper method to provide a non-final value for switch statement
    private int getUnreachableCondition() {
        return 0; // Ensures that the switch cases are never executed
    }

    // Replace DoubleMath.fuzzyEquals with standard Java implementation
    private static class DoubleMath {
        public static boolean fuzzyEquals(double a, double b, double tolerance) {
            return Math.abs(a - b) < tolerance;
        }
    }

    public static void main(String[] args) {
        FuzzyEqualsExample example = new FuzzyEqualsExample(0.0);
        System.out.println(example.showBug(0.1, 0.10005)); // Should demonstrate the bug
    }
}