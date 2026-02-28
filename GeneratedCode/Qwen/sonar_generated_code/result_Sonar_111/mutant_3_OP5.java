class LoopConditionBug {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            sum += i;
            
            // Inserting unreachable switch statement
            boolean switchCondition = getSwitchCondition();
            switch (switchCondition) {
                case true:
                    // This case will never be reached because switchCondition is always false
                    sum -= i;
                    break;
                default:
                    // Default case to ensure the switch is not unreachable
                    sum += 1;
                    break;
            }
        }
        return sum;
    }

    private boolean getSwitchCondition() {
        // Always returns false to make the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        LoopConditionBug bugDemo = new LoopConditionBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}