class LoopConditionBug {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            sum += i;
        }

        // Inserting an unreachable for loop as per the mutation operator
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {  // This loop will never execute because conditionFor is false
            sum -= j;  // Unique operation to ensure the mutant is different
        }

        return sum;
    }

    private boolean getCondition() {
        return false;  // This method returns false, making the loop condition always false
    }

    public static void main(String[] args) {
        LoopConditionBug bugDemo = new LoopConditionBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}