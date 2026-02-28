class BuggyClass {
    private boolean getCondition() {
        return false;
    }

    public void showBug() throws Exception {
        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // Original bug
            throw new Exception("Throwing exception in finally block");

            // Mutant: Unreachable switch statement
            boolean condition = getCondition();
            if (condition) {
                int value = 0;
                switch(value) {
                    case 1:
                        // Unreachable code
                        System.out.println("This code should never execute");
                        break;
                }
            }
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