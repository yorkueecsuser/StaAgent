class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
            unwrittenField = 42; // This line is just to ensure the loop is not empty
        }
        return unwrittenField;
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always false
    }
}