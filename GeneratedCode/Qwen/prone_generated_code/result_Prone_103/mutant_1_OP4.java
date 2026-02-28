class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        return Float.compare(a, b); // BUG: LossyPrimitiveCompare

        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block is reachable if condition is true
            System.out.println("This is a reachable block.");
        } else {
            // This block is unreachable because condition is always false
            System.out.println("This is an unreachable block.");
        }
    }

    private boolean getCondition() {
        // This method returns false, making the else block unreachable
        return false;
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }
}