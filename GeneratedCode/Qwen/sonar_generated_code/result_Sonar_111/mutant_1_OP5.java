class LoopConditionBug {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            sum += i;

            // Introduced unreachable switch statement
            boolean switchCondition = getSwitchCondition();
            switch (switchCondition) {
                case true:
                    System.out.println("This will never be printed");
                    break;
                case false:
                    System.out.println("This will also never be printed");
                    break;
            }
        }
        return sum;
    }

    private boolean getSwitchCondition() {
        return false; // This method ensures the switch condition is dynamically determined but always false
    }

    public static void main(String[] args) {
        LoopConditionBug bugDemo = new LoopConditionBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}