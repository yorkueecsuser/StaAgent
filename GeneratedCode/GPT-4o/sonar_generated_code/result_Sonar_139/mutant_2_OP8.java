class DoubleLongBitsBugExample {

    public double showBug(int i) {
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void main(String[] args) {
        DoubleLongBitsBugExample example = new DoubleLongBitsBugExample();
        int input = 0x80003800;
        double result = example.showBug(input);
        System.out.println("Result: " + result);

        // Mutant code starts here
        DoubleLongBitsBugExample b = new DoubleLongBitsBugExample();
        int j = 0x80003800;
        double mutatedResult = b.showBug(j);
        System.out.println("Mutated Result: " + mutatedResult);
        // Mutant code ends here
    }
}