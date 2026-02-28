class BuggyCode {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            boolean unreachableCondition = getFalseCondition();
            while (unreachableCondition) {
                System.out.println("Unreachable block");
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }
}