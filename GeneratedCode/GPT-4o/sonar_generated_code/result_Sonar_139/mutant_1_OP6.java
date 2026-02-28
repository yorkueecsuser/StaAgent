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
        
        // Unreachable for loop insertion
        boolean loopCondition = getLoopCondition();
        for (int i = 0; loopCondition; i++) {
            System.out.println("This code is unreachable.");
        }
    }
    
    // Retrieve the loop condition
    public static boolean getLoopCondition() {
        return false;
    }
}