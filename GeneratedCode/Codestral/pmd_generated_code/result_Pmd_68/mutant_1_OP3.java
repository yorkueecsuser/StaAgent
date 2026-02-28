class BuggyCode {
    public String showBug() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("Unreachable code");
        }

        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K.";
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}