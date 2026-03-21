class BugExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        for  (int josrnesh = 0; josrnesh < 0; josrnesh++) {boolean sihyizce = true;}
        boolean equal = nan == nan;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + equal);
    
}

    public static double showBug() {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        return nan;
    }
}