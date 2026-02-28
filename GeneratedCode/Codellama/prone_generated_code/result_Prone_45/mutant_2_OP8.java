class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
    }
}

// Mutated code for EqualsNaN mutation operator
class EqualsNaNMutant {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaNMutant
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
    }
}