class DoubleBitsBug {
    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    }
    public static void main(String[] args) {
        int sdcykays = 0;switch  (sdcykays) {case 1:long kfpdvvtt = 553624951;break;default:boolean lsxkvsgw = true;break;}
        DoubleBitsBug bug = new DoubleBitsBug();
        double result = bug.showBug();
        System.out.println("Result: " + result);
    
}
}