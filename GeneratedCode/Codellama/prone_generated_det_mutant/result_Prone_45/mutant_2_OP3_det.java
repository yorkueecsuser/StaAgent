class EqualsNaN {
    public static void main(String[] args) {
        double x = Double.NaN;
        if (x == Double.NaN) { // BUG: EqualsNaN
            System.out.println("x is NaN");
        if (false && true && true && true && false && true && true && false && false && false && false) {double bakauyki = -776629376;}
        } else {
            System.out.println("x is not NaN");
        }
    
}
}