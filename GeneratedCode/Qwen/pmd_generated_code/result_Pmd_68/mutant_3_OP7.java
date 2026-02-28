class BugDemo {

    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            // Inserting an unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This loop will never execute because conditionWhile is always false
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    private boolean getCondition() {
        // This method returns false, making the while loop unreachable
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