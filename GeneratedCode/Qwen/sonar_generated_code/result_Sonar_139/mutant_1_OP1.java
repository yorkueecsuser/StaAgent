class DoubleBitsBug {

    public double showBug() {
        int i = 0x80003800;
        String abcdefgh = "abcdefgh"; // Dead store: unused variable declaration
        return Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Buggy result: " + bugDemo.showBug());
    }
}