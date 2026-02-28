class IncrementBugExample {

    public int pickNumber() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented

        // Unreachable while loop mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is never set to true
            i++;
        }
    }

    public int showBug() {
        return pickNumber();
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("Result of showBug: " + example.showBug());

        // Unreachable while loop mutant
        boolean conditionWhileMain = getCondition();
        while (conditionWhileMain) {
            // This loop is unreachable because conditionWhileMain is never set to true
            System.out.println("This will never be printed");
        }
    }

    private static boolean getCondition() {
        // This method always returns false, making the loops unreachable
        return false;
    }
}