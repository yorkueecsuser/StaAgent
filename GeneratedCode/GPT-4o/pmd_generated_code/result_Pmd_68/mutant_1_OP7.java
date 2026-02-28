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
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This code is unreachable due to the condition
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    // Method to generate a dynamic condition for the while loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}