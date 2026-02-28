public int compareTo(FooBar rhs) {
    boolean condition = getCondition();
    for (int i = 0; condition; i++) {
        // This for loop is unreachable because condition is always false.
        // It is added to demonstrate the "Unreachable for loop" mutation operator.
    }
    return 0;
}

private boolean getCondition() {
    return false;
}