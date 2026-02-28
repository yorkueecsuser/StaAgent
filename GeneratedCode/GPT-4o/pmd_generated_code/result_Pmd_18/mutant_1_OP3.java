class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;
        
        // Adding an unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable.");
        }
        
        return k;
    }
    
    private boolean getCondition() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}