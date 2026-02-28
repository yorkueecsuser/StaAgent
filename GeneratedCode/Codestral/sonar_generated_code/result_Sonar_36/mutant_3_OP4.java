class UninitializedMocksExample {
    private Bar bar;

    public void showBug() {
        boolean shouldRun = getCondition(); // Added Method to dynamically determine the condition
        if (shouldRun) { // Added unreachable if-else statement
            bar.someMethod(); // This line will never be executed as the condition is always false
        } else {
            System.out.println("This else branch is unreachable"); // Added unreachable else branch
        }
        throw new NullPointerException("Bar is not initialized");
    }

    private boolean getCondition() {
        return false; // Always returns false to make the if branch unreachable
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}