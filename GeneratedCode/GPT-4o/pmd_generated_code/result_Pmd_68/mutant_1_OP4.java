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
            // Adding an unreachable if-else statement
            boolean condition = getCondition(); // Using a method to simulate a condition
            if (condition) {
                System.out.println("This will never be executed");
            } else {
                System.out.println("Neither will this");
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    // Method to simulate a condition; always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}