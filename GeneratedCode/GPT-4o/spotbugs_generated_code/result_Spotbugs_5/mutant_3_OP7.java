class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        while (true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This is an infinite loop iteration: " + counter);
            counter++;
            if (counter < 0) { // This condition will never be true; the loop is infinite
                break;
            }

            // Inserting an unreachable while loop
            boolean conditionWhile = getConditionWhile();
            while (conditionWhile) { // This loop is unreachable because conditionWhile is always false
                System.out.println("This code is unreachable.");
            }
        }
    }

    // Method to return a false condition for the unreachable loop
    private boolean getConditionWhile() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}