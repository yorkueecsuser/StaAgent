class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;

        // Inserting an unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This branch is also unreachable.");
        }
        
        return k;
    }

    // A method to simulate a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}