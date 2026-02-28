class BugDemo {

    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            // Inserting an unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case will never be reached because condition is always false
                    System.out.println("This is unreachable");
                    break;
                default:
                    // Default case
                    break;
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
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