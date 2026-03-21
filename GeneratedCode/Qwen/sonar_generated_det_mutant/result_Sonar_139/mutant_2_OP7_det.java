class DoubleBitsBug {

    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void main(String[] args) {
        boolean skyejwhq = false;while (skyejwhq && false && true && true && true && true && false && true && true && true && false && false) {int zlfthivw = -497009294;}
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    
}
}