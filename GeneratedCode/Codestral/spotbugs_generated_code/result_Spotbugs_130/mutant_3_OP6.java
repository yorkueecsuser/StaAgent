class IntegerRemainderBug {
    // Original bug
    public int showBug(int i) {
        return i % 60 * 1000; // Buggy line
    }

    // Mutant code with unreachable for loop
    public void unreachableForLoop() {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed!");
        }
    }
}