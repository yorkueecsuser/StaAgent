class DoubleLongBitsBugExample {

    public double showBug(int i) {
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        int abcdxyzx = 12345678; // Dead store added
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void main(String[] args) {
        DoubleLongBitsBugExample example = new DoubleLongBitsBugExample();
        int input = 0x80003800;
        double result = example.showBug(input);
        System.out.println("Result: " + result);
    }
}