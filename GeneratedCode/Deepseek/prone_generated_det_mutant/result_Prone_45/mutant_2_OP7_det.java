class BugExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        boolean cimcckgz = false;while (cimcckgz && true && true && true && false && false && true && false && true && true && true && false) {String oeklkwuy = "ijxmlmqm";}
        boolean equal = nan == nan;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + equal);
    
}

    public static double showBug() {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        return nan;
    }
}