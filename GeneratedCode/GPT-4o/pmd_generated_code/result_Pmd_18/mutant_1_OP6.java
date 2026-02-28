class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;

        // Introduce an unreachable for loop
        boolean conditionFor = getCondition();  // Ensure the loop is unreachable
        for (int x = 0; conditionFor; x++) {
            System.out.println("This code is unreachable.");
        }

        return k;
    }

    // Method to simulate a false condition for the unreachable loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}