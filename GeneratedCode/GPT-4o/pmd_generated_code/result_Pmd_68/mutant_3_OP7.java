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
            // Adding an unreachable while loop as per the mutation operator
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This block is unreachable
                System.out.println("This is unreachable");
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    // Helper method to mimic a dynamic condition which always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}