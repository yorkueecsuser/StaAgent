class InfiniteLoopExample {

    public void showBug() {
        int counter = 0;
        while (true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This is an infinite loop iteration: " + counter);
            counter++;
            if (counter < 0) { // This condition will never be true; the loop is infinite
                break;
            }

            // Mutation: Unreachable switch statement
            int unreachableSwitchCondition = getUnreachableCondition();
            switch (unreachableSwitchCondition) {
                case 1:
                    System.out.println("This code is unreachable");
                    break;
                default:
                    break;
            }
        }
    }

    // Helper method to ensure the switch condition is unreachable
    private int getUnreachableCondition() {
        return -1; // This will never be 1, so the case 1 block is unreachable
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}