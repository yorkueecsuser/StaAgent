import com.facebook.infer.annotation.NoAllocation;

class MutatedCode {
    private boolean conditionWhile = false;
    private boolean conditionFor = false;
    private int value = 0;

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    public void unreachableWhileLoopMutant() {
        while (conditionWhile) {
            // unreachable code
        }
    }

    public void unreachableForLoopMutant() {
        for (int i = 0; conditionFor; i++) {
            // unreachable code
        }
    }

    public void unreachableIfElseMutant() {
        if (false) {
            // unreachable code
        } else {
            // unreachable code
        }
    }

    public void unreachableSwitchMutant() {
        switch (value) {
            case 1:
                // unreachable code
                break;
            default:
                break;
        }
    }
}