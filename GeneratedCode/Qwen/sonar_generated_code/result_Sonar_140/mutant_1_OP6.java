class IncrementBugExample {

    public int pickNumber() {
        int i = 0;
        int j = 0;

        i = i++; // BUG: Values should not be uselessly incremented
        return j++; // BUG: Values should not be uselessly incremented

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int k = 0; conditionFor; k++) {
            // This loop is unreachable because getCondition() will always return false
            System.out.println("This loop is unreachable");
        }
    }

    public int showBug() {
        return pickNumber();
    }

    public static void main(String[] args) {
        IncrementBugExample example = new IncrementBugExample();
        System.out.println("Result of showBug: " + example.showBug());
    }

    private boolean getCondition() {
        // This method will always return false, making the loop unreachable
        return false;
    }
}