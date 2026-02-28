class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        
        // Inserting an unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) { // This loop is unreachable
            System.out.println("This line will never be executed.");
        }
        
        while (true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This is an infinite loop iteration: " + counter);
            counter++;
            if (counter < 0) { // This condition will never be true; the loop is infinite
                break;
            }
        }
    }

    // Method to simulate a condition that returns false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}