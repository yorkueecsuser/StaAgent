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
            // Unreachable if-else statement added
            boolean condition = getUnreachableCondition();
            if (condition) {
                System.out.println("This will never print.");
            } else {
                System.out.println("Neither will this.");
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    // Method to ensure the condition is not a compile-time constant
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}