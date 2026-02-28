class InfiniteRecursionExample {

    // Method that demonstrates an infinite recursive loop
    public void showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            System.out.println("This is unreachable code.");
        } else {
            // Alternative unreachable code
            System.out.println("This is also unreachable code.");
        }
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    // Recursive method that calls itself indefinitely
    private void recursiveMethod() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some unreachable code
            System.out.println("This is unreachable code.");
        } else {
            // Alternative unreachable code
            System.out.println("This is also unreachable code.");
        }
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}