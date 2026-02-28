class BuggyClass {
    public void showBug() throws Exception {
        boolean conditionFor = getCondition(); // Assume getCondition() is a method that returns a boolean
        try {
            // Performing some operation
            for (int i = 0; conditionFor; i++) { // Unreachable for loop
                System.out.println("This is an unreachable for loop");
            }
        } catch(Exception e) {
            // Handling the exception
        } finally {
            // BUG: DoNotThrowExceptionInFinally
            throw new Exception("Throwing exception in finally block");
        }
    }

    public boolean getCondition() { // Method to dynamically determine the condition for the unreachable for loop
        return false;
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