class DoubleBitsBug {

    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public double showBugWithMutation() {
        int x = 0x80003800; // Renamed variable 'i' to 'x'
        return Double.longBitsToDouble(x);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Buggy result: " + bugDemo.showBug());
        System.out.println("Mutated buggy result: " + bugDemo.showBugWithMutation());
    }
}