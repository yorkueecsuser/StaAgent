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
        return obj1.equals(obj2);
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

// Mutant addition: Renaming a user-defined variable
class FuzzyEqualsExampleMutant {

    private double v;  // Renaming the variable 'value' to 'v'

    public FuzzyEqualsExampleMutant(double v) {
        this.v = v;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FuzzyEqualsExampleMutant other = (FuzzyEqualsExampleMutant) obj;
        return DoubleMath.fuzzyEquals(this.v, other.v, 0.0001); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    }

    @Override
    public int hashCode() {
        return Objects.hash(v);
    }

    public boolean showBug(double v1, double v2) {
        FuzzyEqualsExampleMutant obj1 = new FuzzyEqualsExampleMutant(v1);
        FuzzyEqualsExampleMutant obj2 = new FuzzyEqualsExampleMutant(v2);
        return obj1.equals(obj2);
    }

    private static class DoubleMath {
        public static boolean fuzzyEquals(double a, double b, double tolerance) {
            return Math.abs(a - b) < tolerance;
        }
    }

    public static void main(String[] args) {
        FuzzyEqualsExampleMutant exampleMutant = new FuzzyEqualsExampleMutant(0.0);
        System.out.println(exampleMutant.showBug(0.1, 0.10005)); // Should demonstrate the bug
    }
}