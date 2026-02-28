class InfiniteRecursionExample {

    // Method that demonstrates an infinite recursive loop
    public void showBug() {
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    // Recursive method that calls itself indefinitely
    private void recursiveMethod() {
        int i = 0;
        do {
            // This loop does nothing and is just for demonstration of Equivalent Loop Replacement
            i++;
            if (i > 10) break; // To avoid infinite loop here, but does not affect the recursive bug
        } while (i < 5);
        
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}