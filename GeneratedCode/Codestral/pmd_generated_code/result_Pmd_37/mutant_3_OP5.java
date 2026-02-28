class BuggyClass {
    public void showBug() throws Exception {
        // Adding unreachable switch statement
        boolean shouldRun = false; // This condition will always be false, making the switch unreachable
        if (shouldRun) {
            int value = 0;
            switch(value) {
                case 1:
                    // This code will never be executed
                    System.out.println("Unreachable code");
                    break;
                // More cases can be added here, but they will also be unreachable
            }
        }

        try {
            // Performing some operation
        } catch(Exception e) {
            // Handling the exception
        } finally {
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