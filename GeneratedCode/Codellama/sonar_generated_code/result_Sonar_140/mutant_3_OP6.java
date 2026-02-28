class IncrementingBug {
    public static void main(String[] args) {
        int i = 0;
        i = i++; // BUG: Values should not be uselessly incremented
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // Unreachable for loop
        }
        System.out.println(i); // Outputs 0
    }

    private static boolean getCondition() {
        return false;
    }
}