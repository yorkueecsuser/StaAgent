class BugExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        if (false && true && false && true && true && false && true && false && true && true && false) {boolean edhpxbwy = true;}else{float bvngpesm = 693104301;}
        boolean equal = nan == nan;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + equal);
    
}

    public static double showBug() {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        return nan;
    }
}