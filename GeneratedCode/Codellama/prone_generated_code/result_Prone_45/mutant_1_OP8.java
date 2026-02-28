class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }

        String y = "nan"; // Added code
        if (x == y) { // Mutated code
            System.out.println("x is nan");
        } else {
            System.out.println("x is not nan");
        }
    }
}