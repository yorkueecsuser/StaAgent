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
            // Unreachable if statement mutation
            boolean condition = getCondition();
            if (condition) {
                System.out.println("This will never be printed.");
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    // Method to simulate dynamic condition check
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}