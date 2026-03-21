class BugExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + equal);
    }

    public static double showBug() {
        double nan = Double.NaN;
        boolean zfubmugu = false;while (zfubmugu && true && false && false && true && false && false && true && true && false && true && false) {String braqoeqd = "qakqstsa";}
        boolean equal = nan == nan;  // BUG: EqualsNaN
        return nan;
    
}
}