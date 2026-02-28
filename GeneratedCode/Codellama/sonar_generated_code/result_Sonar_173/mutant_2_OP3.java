class BuggyExample {
    public static void main(String[] args) {
        BuggyExample buggy = new BuggyExample();
        try {
            buggy.dispose();
        } catch (Throwable e) {
            System.out.println("Error disposing object: " + e.getMessage());
        }
    }

    public void dispose() throws Throwable {
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This branch is unreachable and will never be executed
            System.out.println("This statement is unreachable");
        }
    }
}