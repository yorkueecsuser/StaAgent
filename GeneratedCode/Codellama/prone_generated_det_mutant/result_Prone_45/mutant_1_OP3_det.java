class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (true && true && false && true && false && false && false && true && true && true && false) {boolean yzbfssww = true;}
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        } else {
            System.out.println("x is not NaN");
        }
    
}
}