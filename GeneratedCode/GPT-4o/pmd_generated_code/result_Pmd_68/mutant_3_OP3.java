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
            boolean condition = getCondition();
            if (condition) {
                // This block will never be executed
                System.out.println("Unreachable if branch.");
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    // Helper method to ensure condition is always false
    private boolean getCondition() {
        return false; // This ensures the if block is unreachable at runtime
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}