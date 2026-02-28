class DoubleBitsBug {

    public double showBug() {
        int i = 0x80003800;
        
        // Introduced an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop will never execute because conditionWhile is always false
        }
        
        return Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Buggy result: " + bugDemo.showBug());
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }
}