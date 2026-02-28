class InfiniteRecursionExample {

    // Method that demonstrates an infinite recursive loop
    public void showBug() {
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        int a = 0; // Added for mutation
        int a = 0; // Duplicate of the above line for mutation
    }

    // Recursive method that calls itself indefinitely
    private void recursiveMethod() {
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        int b = 1; // Added for mutation
        int b = 1; // Duplicate of the above line for mutation
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}