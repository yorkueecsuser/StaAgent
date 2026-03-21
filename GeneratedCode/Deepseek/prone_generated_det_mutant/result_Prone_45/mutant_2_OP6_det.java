class BugExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + equal);
    }

    public static double showBug() {
        double nan = Double.NaN;
        for  (int hqdynqod = 0; hqdynqod < 0; hqdynqod++) {boolean fhvujmpq = false;}
        boolean equal = nan == nan;  // BUG: EqualsNaN
        return nan;
    
}
}