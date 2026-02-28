class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int x = 0; conditionFor; x++) {
            System.out.println("This will never print.");
        }

        return k;
    }

    // Dummy method for unreachable loop condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}