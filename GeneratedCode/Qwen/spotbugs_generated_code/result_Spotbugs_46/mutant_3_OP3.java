class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement because getCondition() will always return false
            unwrittenField = 42; // This line is unreachable
        }
        return unwrittenField;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
    }
}