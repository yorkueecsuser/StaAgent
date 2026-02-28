class LoopConditionBug {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            sum += i;
        }
        
        // Inserting an unreachable while loop according to the mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
            sum -= i; // Just a placeholder operation to avoid empty loop body
        }
        
        return sum;
    }

    private boolean getCondition() {
        // This method ensures the condition is dynamically determined at runtime and returns false
        return false;
    }

    public static void main(String[] args) {
        LoopConditionBug bugDemo = new LoopConditionBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}