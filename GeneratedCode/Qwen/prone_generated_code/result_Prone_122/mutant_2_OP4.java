class NullTernaryExample {

    public int showBug(boolean flag, Integer foo) {
        int x = flag? foo : null; // BUG: NullTernary

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            x = 42;
        } else {
            // Alternative code that also won't execute
            x = 0;
        }

        return x;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        NullTernaryExample example = new NullTernaryExample();
        try {
            System.out.println(example.showBug(false, 10));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}