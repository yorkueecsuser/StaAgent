class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        // Unreachable if-else statement, the condition is always false
        boolean condition = getCondition();  // A method or variable that determines condition
        if (condition) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This else block is also unreachable at runtime");
        }

        return Integer.parseInt(input); // BUG: AlwaysThrows
    }

    private boolean getCondition() {
        return false;
    }
}