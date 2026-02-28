class LoopConditionCheckerExample {

    public int showBug(int start) {
        int counter = start;
        while (counter < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + counter);
            // The loop condition variable 'counter' is never modified in the loop body
            // Hence, this will result in an infinite loop

            // Adding an unreachable switch statement as per mutation operator
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This will never be reached.");
                    break;
                case 2:
                    System.out.println("This will also never be reached.");
                    break;
                default:
                    // Adding a default case to ensure the switch is complete
                    System.out.println("Default case in unreachable switch.");
            }
        }
        return counter; // This line will never be reached due to the infinite loop
    }

    private int getUnreachableValue() {
        return -1; // Ensures that none of the switch cases match
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}