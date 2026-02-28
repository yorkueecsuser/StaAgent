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
            // Inserting unreachable switch statement
            int value = getFalseCondition()? 1 : 0;
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("This line should never be reached");
                    break;
            }
            // BUG: DoNotThrowExceptionInFinally
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