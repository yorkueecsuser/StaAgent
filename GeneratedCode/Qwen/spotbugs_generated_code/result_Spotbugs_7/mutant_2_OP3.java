class InfiniteRecursionExample {

    // Method that demonstrates an infinite recursive loop
    public void showBug() {
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    // Recursive method that calls itself indefinitely
    private void recursiveMethod() {
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // Unreachable code due to condition always being false
            System.out.println("This is unreachable code.");
        }
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    // Method to return a dynamically determined condition
    private boolean getCondition() {
        return false; // Always returns false, ensuring the if block is unreachable
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}