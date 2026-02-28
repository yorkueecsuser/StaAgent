class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Accessing unwrittenField will return the default value of int, which is 0
        boolean condition = getCondition(); // Ensure the condition is dynamically determined
        if (condition) {
            System.out.println("This line will never be executed.");
        }
        return unwrittenField;
    }

    private boolean getCondition() {
        return false; // This method always returns false at runtime, making the if-block unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}