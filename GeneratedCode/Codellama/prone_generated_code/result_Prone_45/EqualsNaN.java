class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }

        // Unreachable while loop mutant
        while (false) {
            System.out.println("This code is unreachable");
        }
    }
}