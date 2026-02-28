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
            int unreachableSwitchCondition = getUnreachableCondition(); // This will always ensure the switch is unreachable
            switch (unreachableSwitchCondition) {
                case 1:
                    System.out.println("Unreachable code block in switch case");
                    break;
            }
        }
    }

    // Method to simulate runtime condition for the unreachable switch statement
    private int getUnreachableCondition() {
        return 0; // Ensures the switch statement is always unreachable
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}