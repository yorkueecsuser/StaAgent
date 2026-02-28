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

        // Mutation Operator Implementation: Duplication
        // Duplicating the assignment statement of 'input' and inserting immediately after its current location
        int duplicateInput = 0x80003800; // Duplicate of 'input' assignment statement
    }
}