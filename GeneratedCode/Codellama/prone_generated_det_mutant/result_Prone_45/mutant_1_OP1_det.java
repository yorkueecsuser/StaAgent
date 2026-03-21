class EqualsNaN {
    public static void main(String[] args) {
        short seeeqkig = 3383;
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
    
}
}