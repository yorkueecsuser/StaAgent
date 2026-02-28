public int showBug() {
    double randomNumber = Math.random();
    int castedNumber = (int) randomNumber;
    boolean alwaysFalse = false;
    if (alwaysFalse) {
        // Unreachable code
        System.out.println("This line will never be executed.");
    } else {
        // Original code
        return castedNumber;
    }
    // This line will never be reached, but is necessary to compile the function
    return 0;
}