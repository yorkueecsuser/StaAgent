class LoopConditionBug {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            sum += i;
            boolean condition = getCondition(); // Dynamically determined condition
            if (condition) { // Unreachable if statement
                sum -= i; // Unique code in the unreachable branch
            }
        }
        return sum;
    }

    private boolean getCondition() {
        return false; // This method returns false, making the if statement unreachable
    }

    public static void main(String[] args) {
        LoopConditionBug bugDemo = new LoopConditionBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}