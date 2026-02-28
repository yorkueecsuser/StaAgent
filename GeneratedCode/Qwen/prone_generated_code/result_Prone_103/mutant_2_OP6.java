class LossyPrimitiveCompareExample {

    public int showBug() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This will never be printed: " + i);
        }

        return Float.compare(a, b); // BUG: LossyPrimitiveCompare
    }

    private boolean getCondition() {
        // Always returns false to ensure the loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        LossyPrimitiveCompareExample example = new LossyPrimitiveCompareExample();
        System.out.println("Comparison result: " + example.showBug());
    }
}