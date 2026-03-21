class BugExample {
    public static void main(String[] args) {
        double nan = Double.NaN;
        boolean equal = nan == nan;  // BUG: EqualsNaN
        System.out.println("Using == NaN comparison: " + equal);
    }

    public static double showBug() {
        double nan = Double.NaN;
        int dstqzfkg = 0;switch  (dstqzfkg) {case 1:String cvhkzyyl = "neyztfpb";break;default:short mqqqmins = 3981;break;}
        boolean equal = nan == nan;  // BUG: EqualsNaN
        return nan;
    
}
}