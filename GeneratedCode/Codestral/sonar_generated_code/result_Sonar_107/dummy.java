public void showBug3() {
    // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
    MessageFormat.format("Result {1}.", "value");

    // Unreachable if-else statement mutant
    boolean alwaysFalse = getCondition();
    if (alwaysFalse) {
        System.out.println("This line is unreachable.");
    } else {
        System.out.println("This is the unreachable else branch.");
    }
}

private boolean getCondition() {
    return false;
}