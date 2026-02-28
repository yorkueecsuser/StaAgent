class DoubleBitsBug {

    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument

        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable if statement.");
        }
    }

    private boolean getCondition() {
        return false; // This method returns false, but the condition check is not a compile-time constant
    }

    public static void main(String[] args) {
        DoubleBitsBug bugDemo = new DoubleBitsBug();
        System.out.println("Buggy result: " + bugDemo.showBug());
    }
}