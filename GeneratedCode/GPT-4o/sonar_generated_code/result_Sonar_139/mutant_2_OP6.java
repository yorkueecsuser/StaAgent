class DoubleLongBitsBugExample {

    public double showBug(int i) {
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DoubleLongBitsBugExample example = new DoubleLongBitsBugExample();
        int input = 0x80003800;
        double result = example.showBug(input);
        System.out.println("Result: " + result);

        // Unreachable for loop
        DoubleLongBitsBugExample instance = new DoubleLongBitsBugExample();
        boolean conditionFor = instance.getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never print.");
        }
    }
}