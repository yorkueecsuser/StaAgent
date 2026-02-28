class BugExample {
    public BugExample() {
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        for (int i = 0; false; i++) {
            // This unreachable for loop is mutated version of the original code
            // The condition 'false' ensures that this loop will never run.
        }
    }
}