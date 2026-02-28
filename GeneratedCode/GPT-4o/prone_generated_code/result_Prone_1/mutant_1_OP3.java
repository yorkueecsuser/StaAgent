class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        int value = Integer.parseInt(input); // BUG: AlwaysThrows
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
        return value;
    }

    // This method simulates a condition that is always false but not a compile-time constant
    private boolean getFalseCondition() {
        return false;
    }
}