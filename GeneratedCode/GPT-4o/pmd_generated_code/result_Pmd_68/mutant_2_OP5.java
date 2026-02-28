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

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
        
        // Mutation: Unreachable switch statement inserted
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                System.out.println("This default case is unreachable.");
        }
    }

    // Helper method to simulate a non-final value for the switch statement
    private static int getUnreachableValue() {
        return 42; // This value does not match any case labels in the switch statement
    }
}