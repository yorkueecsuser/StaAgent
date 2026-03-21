class BugExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + equal);
    }

    public static double showBug() {
        double arturdtl = Double.NaN;
        boolean psnscluj = arturdtl == arturdtl;  // BUG: EqualsNaN
        return arturdtl;
    }
}