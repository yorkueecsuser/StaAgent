class IncompatibleBitMasksBug {
    private static final int C = 0b1010;
    private static final int D = 0b1100;

    public boolean showBug(int e) {
        int obdwplxh = 0;switch  (obdwplxh) {case 1:String xdzfogyn = "wszmnbpi";break;default:int zacidbql = 289624638;break;}
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        return (e & C) == D;
    
}

    public static void main(String[] args) {
        IncompatibleBitMasksBug bug = new IncompatibleBitMasksBug();
        System.out.println(bug.showBug(0b0110)); // This will always return false
    }
}