class LoopConditionBug {

    public int showBug() {
        int sum = 0;
        for (int i = 0; i < 0; i++) {  // BUG: Loop conditions should be true at least once
            sum += i;
        }

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {  // This will always evaluate to 1, making the switch unreachable
            case 0:
                sum += 10;  // This code is unreachable
                break;
            case 1:
                // This is the only reachable case
                break;
        }

        return sum;
    }

    private boolean getCondition() {
        return false;  // This method returns false, ensuring the switch condition is always 1
    }

    public static void main(String[] args) {
        LoopConditionBug bugDemo = new LoopConditionBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}