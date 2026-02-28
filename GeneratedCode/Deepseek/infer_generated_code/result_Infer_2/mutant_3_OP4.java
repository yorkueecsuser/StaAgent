import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }

    void mutatedMethod() {
        boolean condition = getCondition();
        if (condition) {
            directlyAllocatingMethod();
        } else {
            // unreachable code
            System.out.println("This code is unreachable due to the condition");
        }

        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // unreachable code
            System.out.println("This code is unreachable due to the condition");
            break;
        }

        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // unreachable code
            System.out.println("This code is unreachable due to the condition");
            break;
        }

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // unreachable code
            System.out.println("This code is unreachable due to the condition");
        } else {
            // unreachable code
            System.out.println("This code is unreachable due to the condition");
        }

        int value = getValue();
        switch(value) {
        case 1:
            // unreachable code
            System.out.println("This code is unreachable due to the condition");
            break;
        }
    }
}