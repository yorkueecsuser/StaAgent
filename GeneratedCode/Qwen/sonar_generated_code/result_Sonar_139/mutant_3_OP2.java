class DoubleBitsBug {

    public double showBug() {
        int i = 0x80003800;
        int i_duplicate = 0x80003800;  // Duplicate assignment of the same value
        return Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Buggy result: " + bugDemo.showBug());
    }
}