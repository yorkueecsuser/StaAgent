class UnwrittenFieldDemo {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        // Accessing unwrittenField will return the default value of int, which is 0
        int result = unwrittenField;

        // Introducing an unreachable if-else statement
        boolean isConditionMet = calculateCondition(); // Dynamically set condition
        if (isConditionMet) {
            result += 10; // This branch is designed to be unreachable
        } else {
            result += 5; // Alternative code, should always execute
        }

        return result;
    }

    // Method to simulate a dynamic condition
    private boolean calculateCondition() {
        return false; // This method always returns false, making the above if-else branch effectively unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldDemo demo = new UnwrittenFieldDemo();
        System.out.println("Unwritten Field Value: " + demo.showBug());
    }
}