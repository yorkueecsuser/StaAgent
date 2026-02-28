class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;
        
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int m = 0; conditionFor; m++) {
            System.out.println("This is an unreachable for loop.");
        }
        
        return k;
    }

    // This method simulates a dynamic condition that always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}