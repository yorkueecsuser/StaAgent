class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            // Mutant: Unreachable if statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This code is unreachable
                System.out.println("Unreachable code");
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    private boolean getCondition() {
        return false;
    }
}