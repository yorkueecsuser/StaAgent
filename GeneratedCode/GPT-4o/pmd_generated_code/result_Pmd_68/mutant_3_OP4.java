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
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }
    
    // Mutation: Added an unreachable if-else statement
    public void unreachableCodeExample() {
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the reachable part of the code.");
        }
    }

    private boolean getFalseCondition() {
        return false; // This method is used to simulate a false condition
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
        example.unreachableCodeExample();
    }
}