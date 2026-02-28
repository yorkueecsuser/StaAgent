class LoopConditionBug {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            sum += i;
        }
        
        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            sum += 100; // This will never execute because condition is always false
        }
        
        return sum;
    }

    private boolean getCondition() {
        return false; // This method returns false, making the if branch unreachable
    }

    public static void main(String[] args) {
        LoopConditionBug bugDemo = new LoopConditionBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}