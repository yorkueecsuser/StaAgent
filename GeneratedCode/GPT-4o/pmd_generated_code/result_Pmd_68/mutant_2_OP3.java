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
            // Mutation: Unreachable if statement
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                System.out.println("This code is unreachable.");
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    // Method to simulate a dynamically determined condition
    private boolean getUnreachableCondition() {
        return false; // This ensures the if statement is unreachable
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}