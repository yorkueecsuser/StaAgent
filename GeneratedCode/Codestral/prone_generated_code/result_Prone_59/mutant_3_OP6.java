private boolean fuzzyEquals(double d1, double d2) {
    // Unreachable for loop mutant
    for (int i = 0; false; i++) {
        System.out.println("This code will never be reached");
    }
    return Math.abs(d1 - d2) < EPSILON;
}