class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        while (true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This is an infinite loop iteration: " + counter);
            counter++;
            if (counter < 0) { // This condition will never be true; the loop is infinite
                break;
            }
            
            // Inserting unreachable if statement
            boolean unreachableCondition = getUnreachableCondition(); // Use a method to ensure it's not compile-time constant
            if (unreachableCondition) {
                System.out.println("This will never be executed.");
            }
        }
    }
    
    // Helper method to ensure the condition is not a compile-time constant
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}