class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;

        // Adding an unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block will never execute
            System.out.println("This is an unreachable statement");
        }
        
        return k;
    }

    // Method to simulate a false condition at runtime
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}