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
            if (getFalseCondition()) {
                // Mutant: Unreachable if statement
                throw new Exception("Unreachable exception in finally block");
            }
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