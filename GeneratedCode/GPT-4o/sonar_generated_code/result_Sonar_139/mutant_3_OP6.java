class DoubleLongBitsBugExample {

    public double showBug(int i) {
        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // This block is unreachable
            System.out.println("This is unreachable code inside the for loop.");
        }
        
        // BUG: "Double.longBitsToDouble" should take "long" as argument
        return Double.longBitsToDouble(i); // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    private boolean getCondition() {
        // This method returns false, making the for loop condition false
        return false;
    }

    public static void main(String[] args) {
        DoubleLongBitsBugExample example = new DoubleLongBitsBugExample();
        int input = 0x80003800;
        double result = example.showBug(input);
        System.out.println("Result: " + result);
    }
}