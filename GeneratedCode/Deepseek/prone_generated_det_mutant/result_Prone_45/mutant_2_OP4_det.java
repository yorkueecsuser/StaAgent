class BugExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        if (false && true && true && false && true && false && true && false && true && false && false) {byte fvkasclg = -52;}else{double pisjmzzz = -338887899;}
        boolean equal = nan == nan;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + equal);
    
}

    public static double showBug() {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        return nan;
    }
}