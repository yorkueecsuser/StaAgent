class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        while (true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This is an infinite loop iteration: " + counter);
            counter++;
            if (counter < 0) { // This condition will never be true; the loop is infinite
                break;
            }
            
            // Unreachable if-else statement mutation
            boolean unreachableCondition = getUnreachableCondition(); // dynamically determined at runtime
            if (unreachableCondition) {
                System.out.println("This code is unreachable.");
            } else {
                System.out.println("This code is also unreachable.");
            }
        }
    }
    
    // Method that always returns false to make the condition unreachable
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}