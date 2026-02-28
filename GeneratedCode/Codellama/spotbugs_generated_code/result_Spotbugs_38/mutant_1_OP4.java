class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }

    public boolean getCondition() {
        return false;
    }

    public void unreachableIfElseStatement() {
        boolean condition = getCondition();
        if (condition) {
            // unreachable code
            System.out.println("This code should never be reached");
        } else {
            System.out.println("This code is reachable");
        }
    }

    public void unreachableWhileLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // unreachable code
            System.out.println("This code should never be reached");
        }
    }

    public void unreachableForLoop() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // unreachable code
            System.out.println("This code should never be reached");
        }
    }

    public void unreachableIfElseStatement() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // unreachable code
            System.out.println("This code should never be reached");
        } else {
            System.out.println("This code is reachable");
        }
    }

    public void unreachableSwitchStatement() {
        int value = getValue();
        switch (value) {
            case 1:
                // unreachable code
                System.out.println("This code should never be reached");
                break;
            default:
                System.out.println("This code is reachable");
                break;
        }
    }

    public int getValue() {
        return 0;
    }
}