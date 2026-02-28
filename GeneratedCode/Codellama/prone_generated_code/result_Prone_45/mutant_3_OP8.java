class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
    }

    // Mutant 1: Renaming variable 'x' to 'y'
    public static void main(String[] args) {
        double y = Double.NaN;
        if (y == Double.NaN) { // BUG: EqualsNaN
            System.out.println("y is NaN");
        } else {
            System.out.println("y is not NaN");
        }
    }
}