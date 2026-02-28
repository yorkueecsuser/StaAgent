class DoubleBitsBug {

    public double showBug() {
        int i = 0x80003800;
        
        // Introduced an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This will never be printed");
        }
        
        return Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Buggy result: " + bugDemo.showBug());
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}