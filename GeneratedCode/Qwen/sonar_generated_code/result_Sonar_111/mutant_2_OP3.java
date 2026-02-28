class LoopConditionBug {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            sum += i;
        }
        
        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            sum += 10; // This code is unreachable because getCondition() will always return false
        }
        
        return sum;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false, making the if block unreachable
    }

    public static void main(String[] args) {
        LoopConditionBug bugDemo = new LoopConditionBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}