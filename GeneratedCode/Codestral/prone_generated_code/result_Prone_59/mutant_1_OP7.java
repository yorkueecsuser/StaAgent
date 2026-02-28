private boolean fuzzyEquals(double d1, double d2) {
    boolean conditionWhile = false;
    while (conditionWhile) { // Unreachable while loop
        System.out.println("This line should never be executed");
    }
    return Math.abs(d1 - d2) < EPSILON;
}