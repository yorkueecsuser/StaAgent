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
            // Insert unreachable for loop
            boolean conditionFor = getUnreachableCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This line will never be executed.");
            }
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }
    
    private boolean getUnreachableCondition() {
        return false; // This makes the loop condition always false, making it unreachable.
    }

    public static void main(String[] args) {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        System.out.println(example.showBug());
    }
}