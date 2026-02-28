class BuggyCode {
    private boolean getFalseCondition() {
        return false; // Method returning always false to make the while loop unreachable
    }

    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            boolean unreachableCondition = getFalseCondition();
            while (unreachableCondition) { // Unreachable while loop inserted
                System.out.println("This line will never execute.");
            }
            return "A. O. K."; // Original code
        }
    }
}