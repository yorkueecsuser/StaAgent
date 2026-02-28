class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        while (true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This is an infinite loop iteration: " + counter);
            counter++;
            if (counter < 0) { // This condition will never be true; the loop is infinite
                break;
            }
            
            // Inserted unreachable switch statement
            int unreachableSwitchValue = getUnreachableValue();
            switch (unreachableSwitchValue) {
                case 1:
                    System.out.println("This switch case is unreachable.");
                    break;
                // No 'default' case to ensure it's unreachable
            }
        }
    }
    
    // Method to provide a non-constant value to ensure switch is unreachable
    private int getUnreachableValue() {
        return -1; // Always returns a value not matched by the switch cases
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}