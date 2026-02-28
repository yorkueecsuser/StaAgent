class LoopConditionCheckerExample {

    public int showBug(int start) {
        int counter = start;
        while (counter < 10) { // BUG: LoopConditionChecker
            System.out.println("Counter is " + counter);
            // The loop condition variable 'counter' is never modified in the loop body
            // Hence, this will result in an infinite loop

            // Adding unique mutant code based on Duplication operator
            counter++; // Mutant: incrementing counter to avoid infinite loop
            counter++; // Duplicate the increment statement as per the mutation operator
        }
        return counter; // This line will never be reached due to the infinite loop in the original code
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5);
    }
}