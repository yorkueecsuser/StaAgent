class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        // Mutant code starts
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("x is not NaN");
        }
        // Mutant code ends
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
    }
}