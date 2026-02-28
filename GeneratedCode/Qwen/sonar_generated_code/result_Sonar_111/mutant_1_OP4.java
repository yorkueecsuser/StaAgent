class LoopConditionBug {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            sum += i;
            // Mutant: Inserting an unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                sum += 10;  // This part is unreachable because shouldRun is always false
            } else {
                sum -= 5;   // This part is also unreachable because shouldRun is always false
            }
        }
        return sum;
    }

    private boolean getCondition() {
        return false;  // This method ensures that the condition is always false
    }

    public static void main(String[] args) {
        LoopConditionBug bugDemo = new LoopConditionBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}