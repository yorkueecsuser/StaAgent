class BuggyClass {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // Added mutant code
            if (getFalseCondition()) {
                throw new Exception("Unreachable exception in finally block");
            }
            // Original code
            throw new Exception("Throwing exception in finally block");
        }
    }

    public static void main(String[] args) {
        BuggyClass bc = new BuggyClass();
        try {
            bc.showBug();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}