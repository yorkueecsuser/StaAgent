class IntegerOctalValueBug {
    // BUG: AvoidUsingOctalValues
    public int showBug() {
        int i = 012;    // set i with 10 not 12 BUG: AvoidUsingOctalValues
        int j = 010;    // set j with 8 not 10 BUG: AvoidUsingOctalValues
        int k = i * j;  // set k with 80 not 120 BUG: AvoidUsingOctalValues
        return k;
    }

    boolean getCondition() {
        return false;
    }

    int getValue() {
        return 0;
    }

    void unreachableCode() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable as the condition is always false.
            System.out.println("This is unreachable code.");
        }

        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable as the condition is always false.
            System.out.println("This is unreachable code.");
        }

        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable as the condition is always false.
            System.out.println("This is unreachable code.");
        }

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable as the condition is always false.
            System.out.println("This is unreachable code.");
        } else {
            // This block is unreachable as the condition is always false.
            System.out.println("This is unreachable code.");
        }

        int value = getValue();
        switch(value) {
            case 1:
                // This block is unreachable as the value is always 0.
                System.out.println("This is unreachable code.");
                break;
            default:
                // This block is always reachable.
                System.out.println("This is reachable code.");
        }

    }
}