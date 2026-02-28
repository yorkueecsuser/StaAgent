class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        boolean condition = getCondition();
        if (condition) {
            i = i++;
        }
        System.out.println(i); // Outputs 0
    }

    public static boolean getCondition() {
        // This method simulates a runtime condition
        // that is not always true
        return Math.random() > 0.5;
    }
}