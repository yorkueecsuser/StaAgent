class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            // Mutant code: Unreachable switch statement
            boolean switchCondition = getCondition();
            switch (switchCondition? 1 : 0) {
                case 1:
                    // Unreachable code
                    System.out.println("This should not be printed");
                    break;
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    // Helper method to return false
    private boolean getCondition() {
        return false;
    }
}