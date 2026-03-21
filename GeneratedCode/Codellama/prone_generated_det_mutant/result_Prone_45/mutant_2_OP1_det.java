class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            float zxmsuwkz = -25498563;
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
    
}
}