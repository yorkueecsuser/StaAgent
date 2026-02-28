class BugDemo {

    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block will never execute because shouldRun is always false
                System.out.println("This is an unreachable if block.");
            } else {
                // This block will also never execute because shouldRun is always false
                System.out.println("This is an unreachable else block.");
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the if-else block is unreachable
        return false;
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        try {
            System.out.println(demo.showBug());
        } catch (Exception e) {
            System.err.println("Caught exception: " + e.getMessage());
        }
    }
}