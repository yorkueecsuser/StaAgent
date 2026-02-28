class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            unwrittenField = 42; // This line is unreachable because getCondition() will always return false
        } else {
            // Some alternative unreachable code
            unwrittenField = 24; // This line is also unreachable
        }
        return unwrittenField;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if-else branches unreachable
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
    }
}