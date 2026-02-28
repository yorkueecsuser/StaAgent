class OctalBugExample {

    public int showBug() {
        int i = 012; // BUG: AvoidUsingOctalValues
        int j = 010; // BUG: AvoidUsingOctalValues
        int k = i * j;

        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int m = 0; conditionFor; m++) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This loop is unreachable");
        }

        return k;
    }

    private boolean getCondition() {
        // This method returns false, making the loop condition always false
        return false;
    }

    public static void main(String[] args) {
        OctalBugExample example = new OctalBugExample();
        System.out.println("Result of buggy multiplication: " + example.showBug());
    }
}