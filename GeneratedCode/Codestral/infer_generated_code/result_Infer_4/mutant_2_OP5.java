@PerformanceCritical
public void perfCriticalOperation() {
    int value = getUnreachableValue(); // Method always returns a value that is not 1, making the switch case unreachable
    switch(value) {
        case 1:
            expensiveOps.expensiveOperation(); // This line is unreachable
            break;
        default:
            break;
    }
}

private int getUnreachableValue() {
    return 2; // Always returns a value that is not 1
}