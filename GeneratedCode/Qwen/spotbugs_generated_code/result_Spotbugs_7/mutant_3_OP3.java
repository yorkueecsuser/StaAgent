class InfiniteRecursionExample {

    // Method that demonstrates an infinite recursive loop
    public void showBug() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code due to condition always being false
            System.out.println("This is unreachable code.");
        }
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    // Recursive method that calls itself indefinitely
    private void recursiveMethod() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code due to condition always being false
            System.out.println("This is unreachable code.");
        }
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}