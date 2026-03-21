class BugExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + equal);
    }

    public static double showBug() {
        double nan = Double.NaN;
        boolean njnspqxa = false;while (njnspqxa && false && true && true && true && true && true && true && true && false && false && false) {String wdsertrf = "aqcnyjwk";}
        boolean equal = nan == nan;  // BUG: EqualsNaN
        return nan;
    
}
}