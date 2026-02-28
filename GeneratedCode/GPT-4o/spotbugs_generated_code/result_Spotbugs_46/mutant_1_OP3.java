class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Accessing unwrittenField will return the default value of int, which is 0

        // Inserting unreachable if branch
        boolean condition = getCondition(); // Non-final variable to make it appear dynamic
        if (condition) {
            System.out.println("This code is unreachable because condition is always false");
        }

        return unwrittenField;
    }

    private boolean getCondition() {
        return false; // This method always returns false making the if statement unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}