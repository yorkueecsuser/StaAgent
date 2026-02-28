class BuggyCode {
    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            // Inserting unreachable switch statement
            switch (getFalseCondition()) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code in switch statement");
                    break;
            }
            throw e;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }
}