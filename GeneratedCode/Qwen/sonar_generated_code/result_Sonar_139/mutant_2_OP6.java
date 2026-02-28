class DoubleBitsBug {

    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This will never be printed: " + j);
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the for loop unreachable
        return false;
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Buggy result: " + bugDemo.showBug());
    }
}