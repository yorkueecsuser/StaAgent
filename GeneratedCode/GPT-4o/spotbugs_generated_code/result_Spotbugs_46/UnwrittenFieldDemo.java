class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable but does not cause compilation error
        }
        // Accessing unwrittenField will return the default value of int, which is 0
        return unwrittenField;
    }

    private boolean getCondition() {
        return false; // Ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}