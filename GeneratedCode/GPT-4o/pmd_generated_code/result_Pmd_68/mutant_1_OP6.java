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
            // Inserting unreachable for loop inside the finally block
            boolean conditionFor = getCondition(); // Use a method to simulate a false condition
            for (int i = 0; conditionFor; i++) {
                // Unreachable code inside the loop
                System.out.println("This is unreachable.");
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    private boolean getCondition() {
        return false; // Simulate a condition that is always false
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}