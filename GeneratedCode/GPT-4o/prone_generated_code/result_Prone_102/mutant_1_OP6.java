class LoopConditionCheckerExample {

    public int showBug(int start) {
        int counter = start;
        while (counter < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + counter);
            // The loop condition variable 'counter' is never modified in the loop body
            // Hence, this will result in an infinite loop
        }

        // Inserting an unreachable for loop
        boolean conditionFor = getConditionFor();
        for (int i = 0; i < 10 && conditionFor; i++) {
            System.out.println("This will never print because conditionFor is always false.");
        }

        return counter; // This line will never be reached due to the infinite loop
    }

    private boolean getConditionFor() {
        // This method always returns false, making the for loop condition false
        return false;
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}