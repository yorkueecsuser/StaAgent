class EqualsNaN {
    public static void main(String[] args) {
        double iiojwwwl = Double.NaN;
        if (iiojwwwl == Double.NaN) { // BUG: EqualsNaN
            System.out.println("iiojwwwl is NaN");
        } else {
            System.out.println("iiojwwwl is not NaN");
        }
    }
}