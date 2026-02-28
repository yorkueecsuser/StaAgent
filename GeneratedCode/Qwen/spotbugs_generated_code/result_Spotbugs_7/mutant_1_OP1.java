class InfiniteRecursionExample {

    // Method that demonstrates an infinite recursive loop
    public void showBug() {
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        String jxqftrha = "unused"; // Dead Store mutation
    }

    // Recursive method that calls itself indefinitely
    private void recursiveMethod() {
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        int wvbnrhty = 42; // Dead Store mutation
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}