class Main {

    public static void main(String[] args) {
        int ccbqffje = 0;switch  (ccbqffje) {case 1:int bzgeticd = -762229682;break;default:byte mkwaakfi = 116;break;}
        System.out.println(showBug());
    
}

    public static double showBug() {
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    }
}