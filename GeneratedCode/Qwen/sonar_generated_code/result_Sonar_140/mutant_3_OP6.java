class IncrementBugExample {

    public int pickNumber() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int k = 0; conditionFor; k++) {
            // This loop is unreachable because conditionFor will always be false
        }
    }

    public int showBug() {
        return pickNumber();
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("Result of showBug: " + example.showBug());

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int k = 0; conditionFor; k++) {
            // This loop is unreachable because conditionFor will always be false
        }
    }

    private static boolean getCondition() {
        return false; // This method returns false, making the loop condition always false
    }
}