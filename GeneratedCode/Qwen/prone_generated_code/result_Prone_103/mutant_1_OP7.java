class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop will never execute because conditionWhile is always false
            System.out.println("This is an unreachable loop");
        }

        return Float.compare(a, b); // BUG: LossyPrimitiveCompare
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}