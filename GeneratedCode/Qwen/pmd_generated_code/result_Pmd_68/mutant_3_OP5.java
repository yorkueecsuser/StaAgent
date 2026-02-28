class BugDemo {

    public String showBug() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            // Introduced an unreachable switch statement
            boolean alwaysFalse = getCondition();
            switch (alwaysFalse) {
                case true:
                    System.out.println("This is unreachable code.");
                    break;
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the switch condition is dynamically determined but always false
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