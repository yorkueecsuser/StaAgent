import java.util.concurrent.CompletableFuture;

class ArbitraryCodeExecutionUnderLock {
    private CompletableFuture<Void> future = new CompletableFuture<>();

    public void callFutureSet() {
        future.complete(null);
    }

    public synchronized void example_of_bad_pattern() { // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
        callFutureSet(); // Arbitrary code execution under lock

        // Mutated code (UNREACHABLE SWITCH STATEMENT)
        boolean unreachableCondition = false; // This condition will always be false to make the switch unreachable
        int value = 1;
        switch (unreachableCondition? value : -1) {
            case 1:
                System.out.println("This is an unreachable case");
                break;
        }
    }

    public void showBug() {
        example_of_bad_pattern();
    }

    // Helper method to dynamically determine the condition
    private boolean getCondition() {
        // Implement your logic here
        return false;
    }

    // Helper method to dynamically determine the value
    private int getValue() {
        // Implement your logic here
        return 0;
    }
}