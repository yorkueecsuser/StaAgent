class BugExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + equal);
    }

    public static double showBug() {
        double nan = Double.NaN;
        if (true && true && false && false && false && true && false && true && false && false && false) {int pqmfdcrc = -707948821;}
        boolean equal = nan == nan;  // BUG: EqualsNaN
        return nan;
    
}
}