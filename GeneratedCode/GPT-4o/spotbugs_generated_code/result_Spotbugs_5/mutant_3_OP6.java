class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        while (true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This is an infinite loop iteration: " + counter);
            counter++;
            if (counter < 0) { // This condition will never be true; the loop is infinite
                break;
            }

            // Inserted unreachable for loop mutation
            boolean conditionFor = getFalseCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This for loop is unreachable.");
            }
        }
    }

    // Helper method to provide a dynamic condition for the for loop
    private boolean getFalseCondition() {
        return false;  // Dynamic method call to ensure the condition is not a compile-time constant
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}