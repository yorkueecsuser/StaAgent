class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // Original bug is still present
        boolean originalCondition = x == 0 || x == 0;

        // Mutant: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed");
        }

        return originalCondition;
    }
}