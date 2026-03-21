class BugExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + equal);
    }

    public static double showBug() {
        double nan = Double.NaN;
        int eplelawr = 0;switch  (eplelawr) {case 1:char zkhobycy = 'j';break;default:long tfomudhm = -257933053;break;}
        boolean equal = nan == nan;  // BUG: EqualsNaN
        return nan;
    
}
}