class OctalBugExample {

    public int showBug() {
        int i = 012; // BUG: AvoidUsingOctalValues
        int j = 010; // BUG: AvoidUsingOctalValues
        int k = i * j;

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int m = 0; conditionFor; m++) {
            // This loop is unreachable because getCondition() will return false
            System.out.println("This is an unreachable loop iteration.");
        }

        return k;
    }

    private boolean getCondition() {
        // This method always returns false, making the loop condition false
        return false;
    }

    public static void main(String[] args) {
        OctalBugExample example = new OctalBugExample();
        System.out.println("Result of buggy multiplication: " + example.showBug());
    }
}