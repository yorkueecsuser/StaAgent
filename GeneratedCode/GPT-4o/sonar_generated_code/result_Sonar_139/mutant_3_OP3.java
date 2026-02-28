class DoubleLongBitsBugExample {

    public double showBug(int i) {
        // Introducing an unreachable if statement
        boolean condition = getCondition(); // This method will always return false
        if (condition) {
            System.out.println("This block is unreachable");
        }
        
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
    }
}