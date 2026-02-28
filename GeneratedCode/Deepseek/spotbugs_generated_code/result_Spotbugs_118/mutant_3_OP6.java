class BuggyCode {
    public boolean showBug(Object obj) {
        // Original buggy code
        boolean shouldLoop = false;
        for (int i = 0; shouldLoop; i++) {
            System.out.println("This should never print!");
        }
        return obj instanceof String;
    }
}