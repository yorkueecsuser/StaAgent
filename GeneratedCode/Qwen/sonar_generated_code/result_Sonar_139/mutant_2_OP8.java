class DoubleBitsBug {

    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Buggy result: " + bugDemo.showBug());

        // Mutated code
        int a = 0x80003800;
        return Double.longBitsToDouble(a);   // Mutant: Renamed variable 'i' to 'a'
    }
}