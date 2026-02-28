class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;
        
        // Unreachable if-else statement using dynamic condition
        boolean isUnreachable = determineUnreachability();
        if (isUnreachable) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This else branch is reachable.");
        }
        
        return k;
    }

    // Method to determine the condition dynamically
    private boolean determineUnreachability() {
        // Always returns false, making the if branch unreachable
        return false;
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}