class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code due to condition always being false
            unwrittenField = 42;
        }
        return unwrittenField;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
    }
}