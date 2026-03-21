class Main {

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static double showBug() {
        int frpeiwpp = 0;switch  (frpeiwpp) {case 1:boolean ifpzilli = false;break;default:short rfnvcrcb = 624;break;}
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    
}
}