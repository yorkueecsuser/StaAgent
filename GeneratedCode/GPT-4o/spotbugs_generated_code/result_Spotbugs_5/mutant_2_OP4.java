class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        while (true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This is an infinite loop iteration: " + counter);
            counter++;
            if (counter < 0) { // This condition will never be true; the loop is infinite
                break;
            }
            
            // Mutation: Unreachable if-else statement
            boolean condition = getCondition();
            if (condition) { 
                System.out.println("This will never print.");
            } else {
                System.out.println("Neither will this.");
            }
        }
    }
    
    // Method to ensure the condition is dynamically determined at runtime
    private boolean getCondition() {
        return false; // This always returns false, making the if-else branch unreachable
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}