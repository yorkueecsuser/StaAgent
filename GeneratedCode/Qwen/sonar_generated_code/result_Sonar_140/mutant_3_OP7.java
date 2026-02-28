class IncrementBugExample {

    public int pickNumber() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will never return true
            i++;
        }
    }

    public int showBug() {
        return pickNumber();

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() will never return true
            j++;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the while loops unreachable
        return false;
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("Result of showBug: " + example.showBug());

        // Inserting an unreachable while loop
        boolean conditionWhile = getStaticCondition();
        while (conditionWhile) {
            // This loop is unreachable because getStaticCondition() will never return true
            System.out.println("This will never print");
        }
    }

    private static boolean getStaticCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }
}