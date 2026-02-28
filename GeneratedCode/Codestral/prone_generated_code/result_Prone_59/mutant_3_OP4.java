private boolean fuzzyEquals(double d1, double d2) {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
        System.out.println("Unreachable code executed.");
    } else {
        return Math.abs(d1 - d2) < EPSILON;
    }
}

private boolean getUnreachableCondition() {
    return false;
}