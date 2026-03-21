class BugExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + equal);
    }

    public static double showBug() {
        double nan = Double.NaN;
        if (true && false && true && true && true && false && true && true && false && true && false) {String izhxlcke = "mtkvxpzj";}else{char vhbftapp = 'r';}
        boolean equal = nan == nan;  // BUG: EqualsNaN
        return nan;
    
}
}