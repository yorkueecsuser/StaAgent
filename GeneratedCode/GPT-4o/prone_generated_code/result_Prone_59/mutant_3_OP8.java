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

// Mutant code with variable renaming
class FuzzyEqualsExampleMutant {

    private double x; // Renamed from value

    public FuzzyEqualsExampleMutant(double x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object y) { // Renamed from obj
        if (this == y) {
            return true;
        }
        if (y == null || getClass() != y.getClass()) {
            return false;
        }
        FuzzyEqualsExampleMutant z = (FuzzyEqualsExampleMutant) y; // Renamed from other
        return DoubleMathMutant.fuzzyEquals(this.x, z.x, 0.0001); // BUG: FuzzyEqualsShouldNotBeUsedInEqualsMethod
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }

    public boolean showBug(double a, double b) { // Renamed from value1, value2
        FuzzyEqualsExampleMutant m = new FuzzyEqualsExampleMutant(a); // Renamed from obj1
        FuzzyEqualsExampleMutant n = new FuzzyEqualsExampleMutant(b); // Renamed from obj2
        return m.equals(n);
    }

    // Replace DoubleMath.fuzzyEquals with standard Java implementation
    private static class DoubleMathMutant { // Renamed from DoubleMath
        public static boolean fuzzyEquals(double p, double q, double r) { // Renamed from a, b, tolerance
            return Math.abs(p - q) < r;
        }
    }

    public static void main(String[] args) { 
        FuzzyEqualsExampleMutant exampleMutant = new FuzzyEqualsExampleMutant(0.0);
        System.out.println(exampleMutant.showBug(0.1, 0.10005)); // Should demonstrate the bug
    }
}