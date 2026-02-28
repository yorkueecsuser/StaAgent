class ReturnFromFinallyExample {

    public String showBug() {
        return foo();
    }

    public String foo() {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            throw e;
        } finally {
            // Inserting an unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This block will never execute because conditionWhile is false
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    // Method to provide a non-final condition for the while loop
    private boolean getCondition() {
        return false; // The condition is set to false, making the while loop unreachable
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}