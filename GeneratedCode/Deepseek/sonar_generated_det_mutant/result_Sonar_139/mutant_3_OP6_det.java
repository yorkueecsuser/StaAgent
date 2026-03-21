class Main {

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static double showBug() {
        for  (int jupdyuln = 0; jupdyuln < 0; jupdyuln++) {int cihbcuay = -912136634;}
        int i = 0x80003800;
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    
}
}