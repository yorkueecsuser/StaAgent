class OctalBugExample {

    public int showBug() {
        int i = 012; // BUG: AvoidUsingOctalValues
        int j = 010; // BUG: AvoidUsingOctalValues
        int k = i * j;

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int m = 0; conditionFor; m++) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This will never print: " + m);
        }

        return k;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        OctalBugExample example = new OctalBugExample();
        System.out.println("Result of buggy multiplication: " + example.showBug());
    }
}